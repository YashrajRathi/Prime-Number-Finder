import javax.xml.ws.FaultAction;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class FileManager {

    static final int tenk = 10000;
    static final String location = "D:\\projects\\Prime Number  Finder";

    static boolean write(ArrayList<Integer> list,int num){

        String str = makeFile(num);
        if(str.isEmpty()){return false;}

        File ff = new File(str);

        try {
            FileWriter fw = new FileWriter(ff);
            StringBuilder sb = new StringBuilder();

            sb.append("#" + list.size() + '\n');

            for (int ii : list){
                sb.append("" + ii + '\n');
            }

            fw.write(sb.toString());
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    static String makeFile(int num){
        int dd = num / tenk;
        String subDirectory = location + File.separatorChar +"n"+dd;

        if (!new File(subDirectory).exists()){
            new File(subDirectory).mkdir();
        }

        String fileName = subDirectory + File.separatorChar + "a" + num + ".txt";

        try {
            new File(fileName).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

        return fileName;
    }

    static int[] getPrimes(int num){

        int arr[]= new int[0];
        int dd = num/tenk;

        String fileName = location + File.separatorChar + "n" + dd + File.separatorChar + "a" + num + ".txt" ;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fr);

            String ss = bufferedReader.readLine();
            int length = Integer.parseInt(ss.substring(1));

            arr = new int[length];

            int i =0;

            while (bufferedReader.ready()){
                arr[i] = Integer.parseInt(bufferedReader.readLine());

                ++i;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new int[0];
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }

        return arr;
    }

    static boolean writeWithSquares(ArrayList<Integer> list,int num){

        String str = makeFile(num);
        if(str.isEmpty()){return false;}

        File ff = new File(str);

        try {
            FileWriter fw = new FileWriter(ff);
            StringBuilder sb = new StringBuilder();

            sb.append("#" + list.size() + '\n');

            for (int ii : list){
                long ll = ii;
                ll = ll * ll;
                sb.append("" + ii + ',' + ll + '\n');
            }

            fw.write(sb.toString());
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    static String[][] getPrimesWithSquares(String fileName){

        String ret[][] = new String[2][];
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fr);

            String ss = bufferedReader.readLine();
            int length = Integer.parseInt(ss.substring(1));

            ret = new String[2][length];

            int i =0;

            while (bufferedReader.ready()){
                String str = bufferedReader.readLine();

                String nums[] = str.split(",");
                ret[0][i] = nums[0];
                ret[1][i] = nums[1];

                ++i;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new String[0][];
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0][];
        }

        return ret;

    }

    static String[][] getPrimesWithSquares(int num){
        int dd = num / tenk;
        String fileName = location + File.separatorChar + "n" + dd + File.separatorChar + "a" + num + ".txt";
        return getPrimesWithSquares(fileName);
    }

    static int[][] getPrimesWithSquareintValues(int num){
        String arr[][] = getPrimesWithSquares(num);

        int length = arr[0].length;

        int ret[][] = new int[2][length];
        for(int i=0;i<length;i++){
            ret[0][i] = Integer.parseInt(arr[0][i]);
            ret[1][i] = Integer.parseInt(arr[1][i]);
        }

        return ret;
    }
}
