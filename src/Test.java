import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Test{

    static final BigInteger BigTenK = new BigInteger(Main.tenk +"");
    static final BigInteger zero = BigInteger.ZERO;
    static final BigInteger one = BigInteger.ONE;
    static final BigInteger two = new BigInteger("2");
    static final BigInteger three = new BigInteger("3");
    static final BigInteger four = new BigInteger("4");
    static final BigInteger five = new BigInteger("5");
    static final BigInteger six = new BigInteger("6");

    public static void main(String[] args) {

        /*String[] arr = FileManager.getStringPrimes(0);

        BigInteger bb = new BigInteger("10005");
        System.out.println(bb + " is prime ? " + checkIfPrime(bb,arr));*/

        makeAFolder(new BigInteger("10000000"));

    }

    static long makeAFolder(BigInteger folderNumber){

        long startTime = System.currentTimeMillis();

        BigInteger baseNumber = BigTenK.multiply(folderNumber);
        MyRunnable task[] = new MyRunnable[10000];
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 0;i<10000;i++){

            if (i!=0 && i%100==0){
                service.execute(new UpdateCLass(i));
            }

            task[i] = new MyRunnable(baseNumber.add(new BigInteger(i + "")));
            service.execute(task[i]);
        }

        service.shutdown();

        try{
            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        endTime = endTime - startTime;
        System.out.println("Time taken to complete action is " + endTime);
        return endTime;
    }

    static void makeAFile(BigInteger fileNumber){

        int primelistNumber = 0;
        BigInteger sq ;
        BigInteger upperlimit = fileNumber.add(BigInteger.ONE);
        upperlimit = upperlimit.multiply(BigTenK);

        MyLinkedList<BigInteger> tentativePrimeList = new MyLinkedList<>();

        loopList(fileNumber,tentativePrimeList);

        do{
            String list[] = FileManager.getStringPrimes(primelistNumber);

            MyLinkedList.Node<BigInteger> tt = tentativePrimeList.getFirstNode();
            while(tt != null){
                if (!checkIfPrime(tt.item,list)){
                    tt = tentativePrimeList.unlinkAndGetNext(tt);
                }else{
                    tt = tt.next;
                }
            }

            primelistNumber = primelistNumber + 1;
            sq = new BigInteger((primelistNumber * Main.tenk) + "");
            sq = sq.multiply(sq);
        }while(upperlimit.compareTo(sq) == 1);

        FileManager.write(tentativePrimeList,fileNumber);

    }

    static void loopList(BigInteger fileNumber,MyLinkedList<BigInteger> list){

        BigInteger startValue = BigTenK.multiply(fileNumber);
        BigInteger endValue = startValue.add(BigTenK);

        BigInteger rem = startValue.remainder(six);
        BigInteger first=zero,second=zero;

//        System.out.println(rem);
        if (rem.compareTo(zero) == 0){
            startValue = startValue.add(one);
            first = four;
            second = two;
        }else if (rem.compareTo(two) == 0){
            startValue = startValue.add(three);
            first = two;
            second = four;
        }else if (rem.compareTo(four) == 0){
            startValue = startValue.add(one);
            first = two;
            second = four;
        }

        BigInteger temp = startValue;
        while(temp.compareTo(endValue) == -1){
            list.add(temp);
            temp = temp.add(first);

            list.add(temp);
            temp = temp.add(second);
        }

        if (list.getLast().compareTo(endValue) == 1){
            list.removeLast();
        }

    }

    static boolean checkIfPrime(BigInteger num,final String[] arr){

        for (String ss:arr) {
            BigInteger remainder = num.mod(new BigInteger(ss));
            if (remainder.signum() == 0){
                return false;
            }
        }

        return true;
    }

    static class MyRunnable implements Runnable {

        BigInteger primeFileNumber;

        MyRunnable(BigInteger bb){
            primeFileNumber = bb;
        }

        @Override
        public void run() {

//            System.out.println("Started writing file number : " + primeFileNumber);
            makeAFile(primeFileNumber);
//            System.out.println("Stopped writing file number : " + primeFileNumber);

        }
    }

    static class UpdateCLass implements Runnable{
        int updateNumber;

        UpdateCLass(int num){
            updateNumber = num;
        }


        @Override
        public void run() {
            System.out.println(updateNumber+"% completed");
        }
    }

}