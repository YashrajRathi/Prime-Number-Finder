
import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;

public class pri{
	public static int memo = 0;
	static int ind= 0;
	static long square = 0;
	static LinkedList<Integer> nn = new LinkedList<Integer>();
	static LinkedList<int[]> arr = new LinkedList<int[]>();
	static LinkedList<Integer> tt ;
	static int sqr = 0;
	public static FileWriter fw = null;
	public static FileReader fr = null;
	static public String str1 = "C:\\Users\\HP\\Desktop\\garsh\\prog\\primelists\\";
	public static String str = "C:\\Users\\HP\\Desktop\\garsh\\prog\\primelists\\";
	static String loc = "C:\\Users\\HP\\Desktop\\garsh\\prog\\primediff\\" ;
	static String numloc = "C:\\Users\\HP\\Desktop\\garsh\\prog\\primenums\\" ;
	public static String lct = "C:\\Users\\HP\\Desktop\\garsh\\prog\\primediff\\";
	static int fc = 0;
	static int allmax = 0;
	
	//static int mult =0 ;
	
	public static void main (String args[]) throws java.io.IOException{
		/* nn.add(5);
		nn.add(7);
		nn.add(11);
		nn.add(13);
		nn.add(17);
		int aa = 19;
		int ad =0;
		int fp=0;
		boolean qq = true;
		while(ad<1){
			qq = true;
			fp = (ad+1)*10000;
			while(aa<fp){
				if(isPrime(" ",aa)){
					if(qq){
						qq = false;
					}
				}
				aa = aa + 4;
				isPrime(" ",aa);
				aa=aa+2;
			}
			ad++;
		} */
		//axms(11000);axms(12000);
		/* for(int z = 30 ;z<30;z++){//214748
			mkd(z);
			for(int i =0;i<1000;i++){
				diff("a" + Integer.toString((z*1000) + i) + ".txt");
			}
			axms((z+1)*1000);
		}
		cc("Max =");
		cc(allmax); */
		//for(int i=11000;i<=20000;i=i+1000){axms(i);}
		
	}
	static void facto(int a){
		int lim = sqroot(a);
	}
	static void axms (int a)throws java.io.IOException,FileNotFoundException{
		String loca = loc + "pd" + Integer.toString(a) + "\\";
		a--;
		String adder = "";
		String tmp = "";
		for(int i =0;i<1000;i++){
			fr = new FileReader(loca + "d" + Integer.toString(a-i) + ".txt");
			tmp = "";
			int q=0;
			while((q=fr.read())<(int)'0'||q>(int)'9'){}
			tmp = tmp + (char)q;
			while((q=fr.read())>=(int)'0'&&q<=(int)'9'){
				tmp = tmp + (char)q;
			}
			adder = adder + Integer.toString(a-i) + "," + tmp + '\n';
		}
		fw = new FileWriter(loca + "cond.txt");
		fw.write(adder);
		fw.close();
		cc("I just differed the file -> " + Integer.toString(a));
	}
	static void mkd(int a){
		a = a + 1;
		a= a * 1000;
		File f = new File(loc + "pd" + Integer.toString(a) + "\\");
		if(f.exists()){lct=f.getAbsolutePath();lct = lct + "\\";return;}
		try{
			f.mkdir();
		}
		catch(java.lang.SecurityException s){}
		 lct = f.getAbsolutePath();
		 lct = lct + "\\";
		 cc(lct);
	}
	static void condense(int a) throws java.io.IOException , FileNotFoundException{
		String fina = "log.txt";
		int p[] = rp(fina);
		cc("I am hhhhhere.");
		long t = 0;
		String tmp = "";
		int i=0;
		int l = p.length;
		long avg=0;
		while(i<l){
			avg=0;
			t=i+a; 
			cc(i);
			while(i<t && i<l){
				avg = avg + p[i];
				i++;
			}
			cc("asd -> " + Integer.toString(i));
			avg = avg/a;
			tmp = tmp + Long.toString(t-a) + "," + Long.toString(t) + ",";
			tmp = tmp + Integer.toString((int)avg) + '\n';
			//cc("Average is found to be " + Integer.toString((int)avg));
		}
		fina = "cond.txt";
		try{fw = new FileWriter(numloc + fina);
		fw.write(tmp);
		//cc(tmp);
		fw.close();}
		catch(FileNotFoundException io){
			cc("adadjadn");
		}
	}
	static void condense(int a,String finame) throws java.io.IOException , FileNotFoundException{
		String fina = "log.txt";
		int p[] = rp(fina);
		cc("I am hhhhhere.");
		long t = 0;
		String tmp = "";
		int i=0;
		int l = p.length;
		long avg=0;
		int in = 0;
		while(i<l){
			avg=0;
			t=i+a; 
			cc(i);
			if(t>l){t=l;}
			in =i;
			while(i<t && i<l){
				avg = avg + p[i];
				i++;
			}
			//cc("asd -> " + Integer.toString(i));
			avg = avg/(t-in);
			tmp = tmp + Long.toString(t-a) + "," + Long.toString(t) + ",";
			tmp = tmp + Integer.toString((int)avg) + '\n';
			//cc("Average is found to be " + Integer.toString((int)avg));
		}
		fina = finame;
		try{fw = new FileWriter(numloc + fina);
		fw.write(tmp);
		//cc(tmp);
		fw.close();}
		catch(FileNotFoundException io){
			cc("adadjadn");
		}
	}
	static void log(int a) throws java.io.IOException{
		String fina = "log.txt";
		int i =0,t=0;
		String tmp = "";
		try{
			fr = new FileReader(str + fina);
		}
		catch(FileNotFoundException f){
			fw = new FileWriter(str + fina);
			fr = new FileReader(str + fina);
		}
		while((i=fr.read())==(int)'#'||(i>=(int)'0'&&i<=(int)'9')){
			if(i!=(int)'#'){tmp = tmp + (char)i;}
		}
		cc(tmp);
		int[] p = new int[a+1];
		if(i!=0){
			i = Integer.parseInt(tmp);
			for(int z=0;z<i;z++){
				tmp = "";
				while((t=fr.read())!='\n'){tmp = tmp + (char)t;}
				p[z] = Integer.parseInt(tmp);
				if(z%1000==0){
					cc("Read number of primes in file of " + Integer.toString(z));
				}
			}
		}
		while(i<=a){
			p[i] = index("a" + Integer.toString(i) + ".txt");
			if(i%100 == 0){cc("New read of " + Integer.toString(i));}
			i++;
		}
		t = p.length;
		tmp = "#" + Integer.toString(t) + '\n';
		for(int m=0;m<t;m++){
			tmp = tmp + Integer.toString(p[m]) + '\n';
			if(m % 10000 == 0){cc(m);}
		}
		try{
			fw = new FileWriter(str + fina);
			fw.write(tmp);
			fw.close();
		}
		catch(FileNotFoundException f){}
	}
	static void procfin(int num) throws java.io.IOException{
		int t = num+1;
		t = t*10000;
		if(square<t){initia(t);}
		proc(num);
	}
	static void initia(int a)throws FileNotFoundException{
		int i = ind;
		int l = sqroot(a);
		l = l/10000;
		long te=0;
		while(i<=l){
			//cc("I just initialized file of " + Integer.toString(i));
			arr.add(rp("a" + Integer.toString(i) + ".txt"));
			te = i*10000;
			te=te+10000;
			i++;
		}
		ind = l+1;
		if(te!=0){square = te*te;}
		else{cc("I might have some error ->" + Long.toString(te) + "," + Integer.toString(i));}
	}
	static void checkerror(int a) throws java.io.IOException{
		String ss ="a" + Integer.toString(a) + ".txt";
		int[] p = rp(ss);
		int up = a+1;
		a = a * 10000;
		up = up * 10000;
		String tmp = "";
		int l;
		if(up<p[p.length-1]){
			//cc("I have found this problem in file of " + ss);
			l = p.length - 1;
			tmp = "#" + Integer.toString(l) + '\n';
			for(int i=0;i<l;i++){
				tmp = tmp + Integer.toString(p[i]) + '\n'; 
			}
			try{
				fw = new FileWriter(str + ss);
				fw.write(tmp);
				fw.close();
			}
			catch(FileNotFoundException f){}
		}
		//cc("I am done with" + Integer.toString(a/10000));
	}
	static void proc(int aa) throws java.io.IOException{
		int t = aa*10000;
		String ss="";
		int l = t+10000;
		int add1=0,add2=0;
		if(t%6==0){t++;add1=4;add2=2;}
		else if(t%6==2){t=t+3;add1=2;add2=4;}
		else if(t%6==4){t++;add1=2;add2=4;}
		while(t<l){
			if(isPrime(t)){
				ss = ss + Integer.toString(t) + '\n';
			}
			t=t+add1;
			if(isPrime(t)){
				ss = ss + Integer.toString(t) + '\n';
			}
			t=t+add2;
		}
		try{
			fw = new FileWriter(str + "a" + Integer.toString(aa) + ".txt");
			fw.write(ss);
			//if(aa%100==0){cc("I have written file of " + Integer.toString(aa));}
			fw.close();
		}
		catch(FileNotFoundException f){System.out.println(f);}
	}
	static void completer(String fina) throws java.io.IOException{
		String t ="";
		int a=0;
		try{
			fr = new FileReader(str + fina);
			int i;
			while((i=fr.read())!=-1){
				if(i!=(int)'\n'){
					t = t + (char)i;
				}
				else{
					a = Integer.parseInt(t);
					t = "";
				}
			}
		}
		catch(FileNotFoundException f){
			System.out.println(f);
		}
		int r = a%6;
		int add1=0,add2=0;
		if(r==1){
			add1 =4;add2 = 2;
		}
		else if(r==5){
			add1 = 2;add2 = 4;
		}
		init((sqroot(a))/10000);
		int fp = a/10000;
		t = read(fina);
		if(t.charAt(t.length() - 1)!='\n'){t=t+'\n';}
		fp++;
		fp=fp*10000;
		a=a+add1;
		while(a<fp){
			if(ifPri(a,sqroot(a))){
				//cc(a);
				t = t + Integer.toString(a) + '\n';
			}
			a=a+add2;
			if(ifPri(a,sqroot(a))){
				//cc(a);
				t = t + Integer.toString(a) + '\n';
			}
			a=a+add1;
		}
		try{
			fw = new FileWriter(str + fina);
			fw.write(t);
			fw.close();
		}
		catch(FileNotFoundException f){}
	}
	static boolean isPrime(int num){
		int sqr = sqroot(num);
		int l = arr.size();
		int[] temp;
		boolean t = true;
		int len;
		int i;
		for(int x=0;x<l;x++){
			temp = arr.get(x);
			len = temp.length;
			i=0;
			while(i<len){
				if(temp[i] > sqr){return true;}
				else if(num%temp[i] ==0){return false;}
				i++;
			}
		}
		return true;
	}
	static boolean ifPri(int num,int sqr){
		int l = arr.size();
		int[] temp;
		boolean t = true;
		int len;
		int i;
		for(int x=0;x<l;x++){
			temp = arr.get(x);
			len = temp.length;
			i=0;
			while(i<len){
				if(temp[i] > sqr){return true;}
				else if(num%temp[i] ==0){return false;}
				i++;
			}
		}
		return true;
	}
	static int sqroot(int sq){
		long sqr = sq;
		long a = 100;
		long t=0;
		while(a<sqr){
			a=a*100;
		}
		String tp="";
		a=a/100;
		while(a!=0){
			t=sqr/a;
			sqr = sqr%a;
			a=a/100;
			tp = tp + Integer.toString(prop((int)t));
		}
		return Integer.parseInt(tp);
	}
	static void init(int a)throws FileNotFoundException{
		int i=0;
		while(i<=a){
			arr.add(rp("a" + Integer.toString(i) + ".txt"));
			i++;
		}
	}
	static void diff(String fina) throws java.io.IOException{
		String tmp = "";
		double avg = 0.00000;
		int max = 0;
		int temp = 0;
		int p = fina.indexOf('.');
		String n = fina.substring(1,p);
		int op[] = rp(fina);
		int l = op.length;
		//int wr[] = new int[op.length - 1];
		try{fw = new FileWriter(lct + "d" + n + ".txt");}
		catch(FileNotFoundException f){System.out.println(fw);}
		for(int i=0;i<l-1;i++){
			temp = op[i+1] - op[i];
			if(temp>max){max = temp;}
			avg = avg + temp;
			tmp = tmp + Integer.toString(op[i]) + "," + Integer.toString(op[i+1]) + "," + Integer.toString(op[i+1] - op[i]) + '\n';
		}
		avg = avg/(l-1);
		tmp = "Max=" + Integer.toString(max) + ',' + "Average=" + Double.toString(avg) + '\n' + tmp;
		try{
			fw.write(tmp);
		}
		catch(FileNotFoundException ff){}
		fw.close();
		cc("Max --> " + Integer.toString(max));
		if(max>allmax){allmax=max;}
		cc("I did file of " + fina);
	}
	static int index(int ff) throws java.io.IOException{
		String fina = "a" + Integer.toString(ff) + ".txt";
		fr = new FileReader(str + fina);
		String tmp="";
		int i;
		i = fr.read();
		if(i==(int)'#'){
			//System.out.println("This file is already indexed.");
			while((i = fr.read())>=(int)'0' && i<=(int)'9'){
				tmp = tmp + (char)i;
				//cc(tmp);
			}
			i = Integer.parseInt(tmp);
			return i;
		}
		String t = read(fina);
		String temp[] = t.split("\r\n|\r|\n");
		int w = temp.length;
		try{
			fw = new FileWriter(str + fina);
			fw.write("#" + Integer.toString(w) + '\n' + t);
			fw.close();
		}
		catch(FileNotFoundException f){System.out.println(f);}
		//System.out.println("There are total "+ w +" primes in this file");
		return w;
	}
	static int index(String fina) throws java.io.IOException{
		fr = new FileReader(str + fina);
		String tmp="";
		int i;
		i = fr.read();
		if(i==(int)'#'){
			//System.out.println("This file is already indexed.");
			while((i = fr.read())>=(int)'0' && i<=(int)'9'){
				tmp = tmp + (char)i;
				//cc(tmp);
			}
			i = Integer.parseInt(tmp);
			return i;
		}
		String t = read(fina);
		String temp[] = t.split("\r\n|\r|\n");
		int w = temp.length;
		try{
			fw = new FileWriter(str + fina);
			fw.write("#" + Integer.toString(w) + '\n' + t);
			fw.close();
		}
		catch(FileNotFoundException f){System.out.println(f);}
		System.out.println("There are total "+ w +" primes in this file");
		return w;
	}
	public static int[] rp(String s) throws FileNotFoundException{//read primes
		String t = read(s);
		String ss="";
		int x =1;
		char c;
		if(t.charAt(0)=='#'){
			while((c = t.charAt(x))!='\n'){
				ss = ss + c;
				x++;
			}
			t = t.substring(x+1);
		}
		String temp[] = t.split("\r\n|\r|\n");
		int ret[] = new int[temp.length];
		for(int i=0;i<ret.length;i++){
			//if(i%100==0){cc("I am right now doing file of" + Integer.toString(i));}
			ret[i] = Integer.parseInt(temp[i]);
			//System.out.println(ret[i]);
		}
		return ret;
	}
	static void write(String s,String fina) throws java.io.IOException{
		String temp = read(fina);
		try{
			fw = new FileWriter(str + fina);
			fw.write(temp + s);
			fw.close();
		}
		catch(FileNotFoundException f){System.out.println(f);}		
	}
	public static String read(String st) throws FileNotFoundException{
		String ret = "";
		int i;
		try{fr = new FileReader(str + st);}
		catch(FileNotFoundException f){return "a";}
		try{
			while((i=fr.read())!=-1){
				ret = ret + (char)i ;
			}
		}
		catch(java.io.IOException io){System.out.println("bss");}
		return ret;
	}
	public static void rd(String st){
		int i;
		tt = new LinkedList<Integer>();
		String t = "";
		try{fr = new FileReader(str + st);}
		catch(FileNotFoundException fnfe){cc(fnfe);}
		try{
		while((i=fr.read())!=-1){
			if(i==(int)'\n'){
				tt.add(Integer.parseInt(t));
				t = "";
			}
			else{
				t = t+(char)(i);
			}
		}}
		catch(java.io.IOException ioe){cc(ioe);}
	}
	public static void cc(Object abc){
		System.out.println(abc);
	}
	static boolean isPrime(String ss,int num){
		int length = nn.size();
		int i =0;
		int mm = nn.get(i);
		if(num%mm==0){return false;}
		i++;mm = nn.get(i);
		if(num%mm==0){return false;}
		i++;mm = nn.get(i);
		if(num%mm==0){return false;}
		i++;mm = nn.get(i);
		if(num%mm==0){return false;}
		i++;
		boolean c = true;
		boolean d = true;
		while(c){
			mm = nn.get(i);
			if(d&&sqr<mm){
				d =false;
				sqr=numt(num);
			}
			if(((!d)&&sqr<mm)||i+1==length){
				c = false;
			}
			if(num%mm==0){
				return false;
			}
			i++;
		}
		//cc(num);
		nn.addLast(num);
		return false;
	}
	static int what(int a){
		if(a==0){return 1;}
		else if(a==1){return 2;}
		else if(a==2){return 2;}
		else if(a==3){return 2;}
		else if(a==4){return 3;}
		else if(a==5){return 3;}
		else if(a==6){return 3;}
		else if(a==7){return 3;}
		else if(a==8){return 3;}
		else if(a==9){return 4;}
		else if(a==10){return 4;}
		else if(a==11){return 4;}
		else if(a==12){return 4;}
		else if(a==13){return 4;}
		else if(a==14){return 4;}
		else if(a==15){return 4;}
		else if(a==16){return 5;}
		else if(a==17){return 5;}
		else if(a==18){return 5;}
		else if(a==19){return 5;}
		else if(a==20){return 5;}
		else if(a==21){return 5;}
		else if(a==22){return 5;}
		else if(a==23){return 5;}
		else if(a==24){return 5;}
		else if(a==25){return 6;}
		else if(a==26){return 6;}
		else if(a==27){return 6;}
		else if(a==28){return 6;}
		else if(a==29){return 6;}
		else if(a==30){return 6;}
		else if(a==31){return 6;}
		else if(a==32){return 6;}
		else if(a==33){return 6;}
		else if(a==34){return 6;}
		else if(a==35){return 6;}
		else if(a==36){return 7;}
		else if(a==37){return 7;}
		else if(a==38){return 7;}
		else if(a==39){return 7;}
		else if(a==40){return 7;}
		else if(a==41){return 7;}
		else if(a==42){return 7;}
		else if(a==43){return 7;}
		else if(a==44){return 7;}
		else if(a==45){return 7;}
		else if(a==46){return 7;}
		else if(a==47){return 7;}
		else if(a==48){return 7;}
		else if(a==49){return 8;}
		else if(a==50){return 8;}
		else if(a==51){return 8;}
		else if(a==52){return 8;}
		else if(a==53){return 8;}
		else if(a==54){return 8;}
		else if(a==55){return 8;}
		else if(a==56){return 8;}
		else if(a==57){return 8;}
		else if(a==58){return 8;}
		else if(a==59){return 8;}
		else if(a==60){return 8;}
		else if(a==61){return 8;}
		else if(a==62){return 8;}
		else if(a==63){return 8;}
		else if(a==64){return 9;}
		else if(a==65){return 9;}
		else if(a==66){return 9;}
		else if(a==67){return 9;}
		else if(a==68){return 9;}
		else if(a==69){return 9;}
		else if(a==70){return 9;}
		else if(a==71){return 9;}
		else if(a==72){return 9;}
		else if(a==73){return 9;}
		else if(a==74){return 9;}
		else if(a==75){return 9;}
		else if(a==76){return 9;}
		else if(a==77){return 9;}
		else if(a==78){return 9;}
		else if(a==79){return 9;}
		else if(a==80){return 9;}
		else if(a==81){return 10;}
		else if(a==82){return 10;}
		else if(a==83){return 10;}
		else if(a==84){return 10;}
		else if(a==85){return 10;}
		else if(a==86){return 10;}
		else if(a==87){return 10;}
		else if(a==88){return 10;}
		else if(a==89){return 10;}
		else if(a==90){return 10;}
		else if(a==91){return 10;}
		else if(a==92){return 10;}
		else if(a==93){return 10;}
		else if(a==94){return 10;}
		else if(a==95){return 10;}
		else if(a==96){return 10;}
		else if(a==97){return 10;}
		else if(a==98){return 10;}
		return 10;
	}
	static int prop(int num){
		return numt(num) - 1;
	}
	static int numt(int a){
		int mult =0 ;
		int ret;
		while(a>=100){
			a=a/100;
			mult++;
		}
		ret = what(a);
		while(mult!=0){
			ret = ret * 10;
			mult--;
		}
		return ret;
	}
}