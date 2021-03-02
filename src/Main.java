import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    static ArrayList<Integer> list = new ArrayList<>();
    static final int tenk = 10000;

    public static void main(String[] args) {

        /*The way to get prime numbers until 10^4*/
//        getInitialShitTogether();


        /*
        * This is the part to get prime numbers until 10^8.
        * It is the most optimized and fasted way to get the job done.
        * */
        /*times[0] = System.currentTimeMillis();

        Runnable endThread = new Runnable() {
            @Override
            public void run() {
                times[1] = System.currentTimeMillis();

                long totalTimeTaken = times[1] - times[0];
                System.out.println("Time taken to do task : " + totalTimeTaken);
            }
        };

        int limit = 10000;
        Runnable[] pool = new Runnable[limit];

        int i = 0;
        while(i<limit){
            pool[i] = new myRunnable(i+1);

            i++;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        i=0;
        while(i<limit){
            executorService.execute(pool[i]);
            i++;
        }
        executorService.execute(endThread);

        executorService.shutdown();
        System.out.println("Stopped doing work");*/

        /*
        *This is the way to get higher prime numbers (more than 10^8)
        * It is not the most optimized way but it can still work for now
        */

        /*final long[] times = new long[2];
        times[0] = System.currentTimeMillis();

        Runnable endThread = new Runnable() {
            @Override
            public void run() {
                times[1] = System.currentTimeMillis();

                long totalTimeTaken = times[1] - times[0];
                System.out.println("Time taken to do task : " + totalTimeTaken);
            }
        };

        int limit = 10000;
        anotherRunnable[] pool = new anotherRunnable[limit];

        int i = 0;
        while(i<limit){
            pool[i] = new anotherRunnable(i+10000);

            i++;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        i=0;
        while(i<limit){
            executorService.execute(pool[i]);
            i++;
        }
        executorService.execute(endThread);

        executorService.shutdown();
        System.out.println("Stopped doing work");*/

        /*for(int i = 7;i<=20;i++){
            long temp = makeFolder(i);
            appendToLogFile(i+"=>"+temp+" milliseconds");
        }*/

        makeFolder(20);

    }

    static void makePrimeFile(int primeFileNumber,int targetFileNumber,int extra,int first,int second){
        int ind = comparisionState(primeFileNumber,targetFileNumber);

        int startNumber = targetFileNumber * tenk;
        int num = startNumber + extra;

        ArrayList<Integer> res = loop(num,ind,startNumber + tenk,first,second,primeFileNumber);

        FileManager.write(res,targetFileNumber);
    }

    static boolean checkIfPrime(int num){

        for (int ii : list){

            if(num%ii == 0){
                return false;
            }
        }

        return true;
    }

    static void getInitialShitTogether(){
        list.add(5);

        int n = 7;
        while(n<tenk){
            if(checkIfPrime(n)){
                list.add(n);
            }
            n=n+4;

            if(checkIfPrime(n)){
                list.add(n);
            }
            n=n+2;
        }

        FileManager.writeWithSquares(list,0);

    }

    static void writeFileNumberComparing(int num){
        int dd = num * tenk;

        int rem = dd%6;

        switch (rem){
            case 0 : {
                makePrimeFile(0,num,1,4,2);
                break;
            }
            case 2 : {
                makePrimeFile(0,num,3,2,4);
                break;
            }
            case 4 : {
                makePrimeFile(0,num,1,2,4);
                break;
            }
        }

    }

    static void writeFileNumber(int num){
        int dd = num * tenk;

        int rem = dd%6;

        switch (rem){
            case 0:{
                loopForPrimeList(dd,dd+1,dd+tenk,4,2,new ArrayList<>());
                break;
            }
            case 2:{
                loopForPrimeList(dd,dd+3,dd+tenk,2,4,new ArrayList<>());
                break;
            }
            case 4:{
                loopForPrimeList(dd,dd+1,dd+tenk,2,4,new ArrayList<>());
                break;
            }
        }
    }

    static int binaryIndexSearch(int num,int arr[],int l,int r){
        if (l == r) return r;

        int mid = l + (r-l)/2;
        if (arr[mid] == num) return mid;

        if (arr[mid] > num) return binaryIndexSearch(num,arr,l,mid);

        return binaryIndexSearch(num,arr,mid+1,r);

    }

    static int getInsertPosition(int num,int arr[]){
        int lastIndex = arr.length - 1;
        if(arr[lastIndex] < num){
            return arr.length;
        }else if(arr[0] > num){
            return 0;
        }

        return binaryIndexSearch(num,arr,0,lastIndex);
    }

    static int comparisionState(int primeFile,int targetFileNumber){
        int ret = -1;

        int squarePrimeFile = getSquareLimitForFile(primeFile);
        int squareTargetFileNumber = getUpperLimitOfFile(targetFileNumber);

        if (squareTargetFileNumber > squarePrimeFile) return -1;

        return placeANumber(primeFile, targetFileNumber);

    }

    static int getSquareLimitForFile(int fileName){
        fileName = getUpperLimitOfFile(fileName);
        fileName = fileName * fileName;
        return fileName;
    }

    static int getUpperLimitOfFile(int fileName){
        fileName = fileName + 1;
        fileName = fileName * tenk;
        return fileName;
    }

    static int placeANumber(int fileToBeLoaded,int targetFileNumber){

//        System.out.println("sdlvnslvnsvn"+fileToBeLoaded);
        int arr[][] = FileManager.getPrimesWithSquareintValues(fileToBeLoaded);

        targetFileNumber = getUpperLimitOfFile(targetFileNumber);
        return getInsertPosition(targetFileNumber,arr[1]);

    }

    static void say(Object...args){
        for (Object ss : args) {
            System.out.println(ss);
        }
    }

    static ArrayList loop(int num,int ind,int limit,int first,int second,int primeFileNumber){

//        say(num,ind,limit,first,second,primeFileNumber);

        int arr[] = FileManager.getPrimesWithSquareintValues(primeFileNumber)[0];
        ArrayList<Integer> al = new ArrayList<>();

        while(num<limit){

            if (checkIfPrime(num,arr,ind)) {
                al.add(num);
            }
            num = num + first;

            if (num < limit && checkIfPrime(num,arr,ind)) {
                al.add(num);
            }
            num = num + second;

        }

//        say(al.toArray(new int[0]));
        return al;
    }

    static void loopForPrimeList(int number,int num,int limit,int first,int second,ArrayList<Integer> al){

        while(num<limit){

            al.add(num);
            num = num + first;

            if (num < limit) {
                al.add(num);
            }
            num = num + second;

        }

        int i = 0;

        int sq = 0;

//        say(sq,limit);

        do{
            int arr[];

            if (i==0){
                arr = FileManager.getPrimesWithSquareintValues(i)[0];
            }else{
                arr = FileManager.getPrimes(i);
            }

            ArrayList<Integer> ll = new ArrayList<>();

            for (int nn : al){
                if (checkIfPrime(nn,arr)){
                    ll.add(nn);
                }
            }

//            System.out.println("This should at least print");
//            System.out.println(ll);
            al = ll;

            i=i+1;
            sq = getSquareLimitForFile(i);
        }while(sq < limit);

        FileManager.write(al,number/tenk);

    }

    static boolean checkIfPrime(int num,int arr[]){
        for (int ii : arr){

            if(num%ii == 0){
                return false;
            }
        }

        return true;
    }

    static boolean checkIfPrime(int num,int arr[],int ind){

        for (int ii =0;ii<ind;ii++){

            if(num%arr[ii] == 0){
                return false;
            }
        }

        return true;

    }

    static class myRunnable implements Runnable{

        int primeFileNumber;

        myRunnable(int num){
            primeFileNumber = num;
        }
        @Override
        public void run() {
//            System.out.println("Started filling fileNumber : " + primeFileNumber);

            writeFileNumberComparing(primeFileNumber);

//            System.out.println("Done filling the fileNumber : " + primeFileNumber);
        }
    }

    static class anotherRunnable implements Runnable{

        int primeFileNumber;

        anotherRunnable(int num){
            primeFileNumber = num;
        }
        @Override
        public void run() {
//            System.out.println("Started filling fileNumber : " + primeFileNumber);

            writeFileNumber(primeFileNumber);

//            System.out.println("Done filling the fileNumber : " + primeFileNumber);
        }
    }

    static long makeFolder(int folderNumber){
        System.out.println("Filling folder number : " + folderNumber);
        long startTime = System.currentTimeMillis();

        folderNumber = folderNumber * tenk;
        int size = 10000;

        anotherRunnable[] pool = new anotherRunnable[10000];

        int i = 0;
        while(i<size){
            pool[i] = new anotherRunnable(folderNumber+i);
            i++;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        i=0;
        while(i<size){
            executorService.execute(pool[i]);
            i++;
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        endTime = endTime - startTime;
        System.out.println("Time taken to complete action is " + endTime);
        return endTime;

    }

    static void appendToLogFile(String string){
        try {

            if (!new File(FileManager.logLocation).exists()){
                new File(FileManager.logLocation).createNewFile();
            }

            BufferedWriter out = new BufferedWriter(
                    new FileWriter(FileManager.logLocation,true)
            );
            out.write(string + '\n');
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
