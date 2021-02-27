import pp.pri;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.*;
import java.util.*;
import java.io.FileNotFoundException;
public class prifin{
	static BigInteger[][] valer = new BigInteger[6][];
	static boolean valerflag = true;
	static boolean flag = true;
	static int loaded=0;
	static LinkedList<BigInteger[]> val = new LinkedList<BigInteger[]>();
	static BigInteger lim = bb(0); 
	static FileReader fr;
	static int pack=0;
	static BigInteger pk;
	public static String str = "C:\\Users\\HP\\Desktop\\garsh\\prog\\pp\\";
	static int[] diffs = null;
	static int[] nums = null;
	static BigInteger zz = bb(0);
	static int exp = 1;
	
	
	
	public static void main(String Args[]) throws java.io.IOException{
		//loger(bb(1),str,new boolean[10]);
		//test();
		//load();
		//procBig("4899999342");
		//primefact(new BigInteger("489999934200010009"));
		/* BigInteger p[] = give(new BigInteger("48999993420001"));*/
		/* BigInteger p1 = new BigInteger("3999999999999901081");
		BigInteger p2 = new BigInteger("3999999999999901217");
		BigInteger one = bb(1);
		p1 = p1.add(one);
		while(p1.compareTo(p2) < 0){
			primefact(p1);
			p1 = p1.add(one);*/
		/*for(int i=0;i<p.length;i++){
			primefact(p[i]);
		} */
		//primefact(new BigInteger("98605360515"));
		//proc(12);
		//write(bb(63287),str);
		//proc(9);
		//String pp[] = mm();
		//writeForBig(bb(90167),str + "a9\\");
		//procBig(bb(14));
		//write(bb(70000),str);
		/* int a = 7;
		while(a<20){
			countIt(bb(a));
			a++;
		} */						
		//writeForBig(new BigInteger("399999999999990"),str);
		procBig("39999999998");
		//280238131,280238291
		//for(int i=6;i<10;i++){proc(i);}
		//for(int i = 280238132;i<280238291;i++){primefact(bb(i));}
		//primefact(new BigInteger("12353535432312456"));
		/* BigInteger b1 = bb(100);
		BigInteger b2 = bb(5);
		BigInteger b3 = b1.remainder(b2);
		BigInteger zero = bb(0);
		cc(b3.equals(zero)); */
	}
	static void 			Bigcomplete		(BigInteger ab,String fil){
		BigInteger tt = ab;
		boolean arr[] = new boolean[100000000];
		//cc("I have started the flooding the file of " + tt);
		boolean bb = true;
		int tmp;
		BigInteger p[];
		BigInteger tenthbil = bb(100000000);
		tt = ab.multiply(tenthbil);
		BigInteger upper = tt.add(tenthbil);
		BigInteger tenk = bb(10000);
		BigInteger temp  = sqrt(upper);
		temp = temp.divide(tenk);
		int lim = temp.intValue();
		int ii = 10000;
		while(ii<lim){
			p = give(ii);
			if( ii % 100 == 0 ){cc("Done with the file number of " + ii);}
			int i=0;
			int length = p.length;
			while(i<length){
				if((temp = upper.remainder(p[i])).compareTo(tenthbil) < 0 && (! temp.equals(zz))){
					temp = tenthbil.subtract(temp);
					//cc(p[i].toString() + " will divide the number of " + (tt.add(temp)).toString());
					arr[ temp.intValue( ) ] = true;
				}
				i++;
			}
			ii++;
		}
		i=0;ii=0;
		
		FileReader fr ;
		try{
			fr = new FileReader(fil + );
		}
		catch(java.io.FileNotFoundException fnfe){}
	}
	static void 			loger			(BigInteger name,String loca,boolean arr[]){// Stores prime numbers in a file 
		int count = 0;
		cc("Entered the file creator : ");
		name = name.multiply(bb(100000000));
		int end = arr.length;
		String obj = "";
		for( int i = 1 ; i < end ; i=i+2 ){
			if(arr[i]){count++;}
			//if(i%4096 == 1){cc(i);}
		}
		try{
			FileWriter fw = new FileWriter(loca + "l"+name+".txt");
			fw.write(obj);
			fw.close();
		}
		catch(java.io.IOException ioe){cc("roimrojmqvq");}
		cc("With " + count);
	}
	static void				countIt			(BigInteger ab){
		String loca = str + "a" + ab + "\\";
		FileReader fr ;
		BigInteger tt = ab.multiply(bb(10000));
		BigInteger end = tt.add(bb(10000));
		BigInteger one = bb(1);
		String obj = "";
		while(tt.compareTo(end) < 0){
			obj = obj + tt + "," + getCount(loca,tt) + '\n';
			tt = tt.add(one);
		}
		try{
			FileWriter fw = new FileWriter(loca + "counts.txt");
			fw.write(obj);
			fw.close();
		}
		catch(java.io.IOException ioe){
			cc("ldfknvsldknvs");
		}
		
	}
	static int 				writeForBig		(BigInteger ab,String fil)	throws FileNotFoundException{
		String obj = "";
		int l=10000;
		boolean arr[] = new boolean[l];
		BigInteger nnnn = bb(9999);
		BigInteger upper = ab.add(bb(1));
		BigInteger tenk = bb(10000);
		upper = upper.multiply(tenk);
		BigInteger temp;
		BigInteger sqrt = sqrt(upper);
		sqrt = sqrt.divide(tenk);
		int lim = sqrt.intValue();
		int x = 1;
		BigInteger p[];
		String t1 ;
		FileWriter fw2;
		while(x<lim){
			if(x%500==0){cc(x);}
			if(x%10000==0){
				try{
					String loger = "";
					fw2 = new FileWriter(fil + "log.txt");
					for(int ll = 1;ll<10000;ll++){
						if(arr[ll]){
							loger = loger + ll + '\n';
						}
					}
					fw2.write(loger);
					fw2.close();
				}
				catch(java.io.IOException ioe){cc("slfkvnsdkvns");}
			}
			p = give(x);
			int length = p.length;
			int i=0;
			t1 = Integer.toString(x);
			while(i<length){
				if( (temp = upper.remainder(p[i])).compareTo(tenk) < 0 && (! temp.equals(zz))){
					//cc(t1+" , "+Integer.toString(i)+" , "+temp.toString() + " is remainder");
					temp = tenk.subtract(temp);
					arr[temp.intValue()] = true;
				}
				i++;
			}
			x++;
		}
		ab= ab.multiply(tenk);
		if(valerflag){for(int xx=0;xx<1;xx++){valer[xx]=give(xx);}valerflag=false;}
		for(int d=1;d<10000;d=d+2){
			if(!arr[d]){
				temp = ab.add(bb(d));
				//cc("Checking for " + temp);
				if((temp.remainder(bb(3))).equals(zz)){arr[d]=true;}
				int q=0;
				while((!arr[d])&&q<1){
					//cc(temp.toString());
					p=valer[q];
					int length = p.length;
					int i=0;
					while((!arr[d])&&i<length){
						if((temp.remainder(p[i])).equals(zz)){arr[d]=true;}
						i++;
					}
					q++;
				}
			}
		}
		int count=0;
		for(int q=1;q<10000;q=q+2){
			if(!arr[q]){
				count++;
				//cc((ab.add(bb(q))).toString());
				obj = obj + (ab.add(bb(q))).toString() + '\n';
			}
		}
		//cc("Final count of File of " + ab  + " : " + count);
		obj = "#" + Integer.toString(count) + '\n' + obj;
		ab = ab.divide(tenk);
		try{
			FileWriter fw = new FileWriter(fil + "a" + ab.toString() + ".txt");
			fw.write(obj);
			fw.close();
		}
		catch(java.io.IOException ioe){}
		return count;
	}
	static void 			composites		(String ss)	throws FileNotFoundException{
		BigInteger one = bb(1);
		String tmp = "";
		int i=0;
		char tt = ss.charAt(i);
		while(tt!=','){
			tmp = tmp + tt;
			i++;
			tt = ss.charAt(i);
		}
		BigInteger var1  = new BigInteger(tmp);
		int l = ss.length();
		tmp = "";
		i++;
		while(i<l){
			tmp = tmp + ss.charAt(i);
			i++;
		}
		BigInteger var2 = new BigInteger(tmp);
		var1 = var1.add(one);
		while(! var1.equals(var2)){
			primefact(var1);
			var1 = var1.add(one);
		}
	}
	static void 			primefact		(BigInteger ab)	throws FileNotFoundException{
		BigInteger too = bb(2);
		BigInteger tri = bb(3);
		String abc = ab.toString() + " = 1";
		while((ab.remainder(too)).equals(zz)){ab=ab.divide(too);abc = abc + " x 2"; }
		while((ab.remainder(tri)).equals(zz)){ab=ab.divide(tri);abc = abc + " x 3"; }
		cc(abc + " x " + ab);
		//primeloader(ab);
		BigInteger one = bb(1);
		int i = 0;
		int j = 0;
		BigInteger sqrt = sqrt(ab);
		boolean bl = true;
		BigInteger p[] = new BigInteger[1];
		int ld = 0;
		while(bl){
			try{
				if(p[i].compareTo(sqrt)>0){
					bl = false;
				}
				while(bl && (ab.remainder(p[i])).equals(zz)){
					ab = ab.divide(p[i]);
					sqrt = sqrt(ab);
					abc = abc + " x " + p[i].toString();
					cc(abc + " x " + ab.toString());
				}
			}
			catch(java.lang.IndexOutOfBoundsException pppp){
				p = give(ld);
				if(ld%100==0){cc("It is doing of " + Integer.toString(ld));}
				ld++;
				i=-1;
			}
			catch(java.lang.NullPointerException pppp){
				p = give(ld);
				ld++;
				cc("It is doing of " + Integer.toString(ld));
				i=-1;
			}
			i++;
		}
		/* try{
		while(bl){
			p = val.get(i);
			int l = p.length;
			j=0;
			while(j<l&&bl){
				while((ab.remainder(p[j])).equals(zz)){
					ab = ab.divide(p[j]);
					abc = abc + " x " + p[j].toString();
					cc(abc + " x ...");
				}
				//cc("Testing for " + p[j].toString());
				if(ab.equals(one)){bl = false;}
				j++;
			}
			i++;
		}}
		catch(java.lang.IndexOutOfBoundsException pppp){
			abc = abc + " x " + ab.toString();
		} */
		abc = abc + " x " + ab.toString();
		cc(abc);
		/* cc((val.get(0))[0]);
		String abc = "1";
		BigInteger dd = bb(3);
		BigInteger t = bb(2);
		while(! ab.equals(one)){
			cc("I am chcking for " + dd.toString());
			if((ab.remainder(dd)).equals(zz)){
				ab = ab.divide(dd);
				abc = abc + " x " + dd.toString();
			}
			else{
				dd = dd.add(t);
			}
		}
		cc(abc); */
	}
	static BigInteger 		bb				(int i){
		return new BigInteger(Integer.toString(i));
	}
	static void 			load			()throws FileNotFoundException{
		String pt = pri.str;
		pri.str = str;
		diffs = pri.rp("guidediff.txt");
		nums = pri.rp("guidenum.txt");
		pack =nums[nums.length - 1] + 1;
		pk = bb(pack);
		cc(nums.length);
		cc(diffs.length);
		pri.str = pt;
	}
	static void 			procBig			(BigInteger ab)throws FileNotFoundException{
		FileWriter fw ;
		BigInteger tt = ab;
		String fil = dirForBig(tt);
		boolean arr[] = new boolean[100000000];
		//cc("I have started the flooding the file of " + tt);
		boolean bb = true;
		int tmp;
		BigInteger p[];
		String tempo = "";
		String obj = "";
		BigInteger tenthbil = bb(100000000);
		tt = ab.multiply(tenthbil);
		BigInteger upper = tt.add(tenthbil);
		BigInteger tenk = bb(10000);
		BigInteger temp  = sqrt(upper);
		temp = temp.divide(tenk);
		int lim = temp.intValue();
		int ii = 10000;
		/* while(ii<lim){
			p = give(ii);
			if( ii % 100 == 0 ){cc("Done with the file number of " + ii);}
			int i=0;
			int length = p.length;
			while(i<length){
				if((temp = upper.remainder(p[i])).compareTo(tenthbil) < 0 && (! temp.equals(zz))){
					temp = tenthbil.subtract(temp);
					//cc(p[i].toString() + " will divide the number of " + (tt.add(temp)).toString());
					arr[ temp.intValue( ) ] = true;
				}
				i++;
			}
			if(ii%1000==0 && ii!=0){
				//loger(ab,fil,arr);
				cc("I have written after ii=" + ii);
			}
			ii++;
		} */
		BigInteger two = tt.add(tenk);
		int ver = 0;
		ii = 1;
		while(two.compareTo(upper) <= 0){
			ii=1;
			while(ii < 10000){
				p = give(ii);
				int i =0;
				int length = p.length;
				while(i<length){
					if((temp = two.remainder(p[i])).compareTo(tenk) < 0 && (!temp.equals(zz))){
						temp = tenk.subtract(temp);
						arr[ver + temp.intValue()] = true;
					}
					i++;
				}
				ii++;
			}
			int qa = 1 ;
			BigInteger three = bb(3);	
			temp = two.subtract(tenk);
			temp = temp.add(bb(1));
			p=give(0);
			int i =0;
			int length = p.length;
			while(qa < 10000){
				if(!arr[qa + ver]){
					if((temp.remainder(three)).equals(zz)){arr[qa + ver] = true;}
					i=0;
					while(!arr[qa + ver] && i < length){
						if((temp.remainder(p[i])).equals(zz)){arr[qa + ver] = true;}
						i++;
					}
				}
				temp = temp.add(bb(2));
				qa = qa + 2;
			}
			String sst = ""; 
			int counter = 0;
			temp = two.subtract(tenk);
			temp = temp.add(bb(1));
			qa = 1;
			while(qa < 10000){
				if(!arr[qa + ver]){
					counter++;
					sst = sst + temp.toString() + '\n';
				}
				temp = temp.add(bb(2));
				qa = qa + 2;
			}
			temp = two.subtract(tenk);
			temp = two.divide(tenk);
			try{
				fw = new FileWriter(fil + "a" + (temp.subtract(bb(1))).toString() + ".txt");
				fw.write("#" + Integer.toString(counter) + '\n' + sst);
				fw.close();
				cc("File created : " + temp.toString());
			}
			catch(java.io.IOException ioe){}
			ver = ver + 10000;
			two = two.add(tenk);
		}
		/* 
		
		ii=1;
		tmp = 0 ;
		tt = tt.add(bb(1));
		two = bb(2);
		ver = 9999;
		String sst = "";
		int ginti = 0 ;
		while(ii<100000000){
			if(! arr[ii]){
				cc("Doing the number of " + ii);
				if((tt.remainder(three)).equals(zz)){arr[ii] = true;}
				tmp=0;
				while(!arr[ii] && tmp<10000){
					p = give(tmp);
					int i =0;
					lim = p.length;
					while(!arr[ii] && i<lim){
						if((tt.remainder(p[i])).equals(zz)){arr[ii] = true;}
						i++;
					}
					tmp++;
				}
				//if(!arr[ii]){cc(tt);}
			}
			//else{cc(tt);}
			if(!arr[ii]){
				sst = sst + tt.toString() + '\n';
				ginti++;
			}
			if(ii==ver){
				ver = ver + 10000;
				temp = tt.divide(tenk);
				//temp = temp.subtract(bb(1));
				try{
					fw = new FileWriter(fil + "a" + temp.toString() + ".txt");
					fw.write("#" + Integer.toString(ginti) + '\n' + sst);
					fw.close();
					cc(temp.toString() + ": File created");
					sst = "";
					ginti = 0;
				}
				catch(java.io.IOException ioe){}
			}
			tt = tt.add(two);
			ii = ii + 2;
		} */
	}
	static void 			procBig			(String BigInteger)throws FileNotFoundException{
		procBig(new BigInteger(BigInteger));
	}
	static String 			dirForBig		(BigInteger fina){
		File ff = new File(str +"a"+ fina.toString());
		if(ff.exists()){
			return ff.getAbsolutePath() + "\\";
		}
		try{
			ff.mkdir();
		}
		catch(java.lang.SecurityException s){}
		return ff.getAbsolutePath() + "\\";
	}
	static void 			proc			(int fina) throws java.io.IOException{
		String fil = checkdir(fina);
		cc("I have started flooding the file of " + fil);
		boolean bb = true;
		int tmp;
		String tempo="";
		String obj="";
		//cc(fil);
		BigInteger tt = new BigInteger(Integer.toString(fina));
		tt = tt.multiply(new BigInteger("10000"));
		int i = 0;
		while(bb&&i<10000){
			try{
				pri.fr = new FileReader(fil + "a" + tt.toString() + ".txt");
			}
			catch(java.io.FileNotFoundException fnfe){
				bb = false;
			}
			if(bb){i++;tt = tt.add(new BigInteger("1"));}
		}
		//tt = tt.subtract(bb(1));
		BigInteger c = bb(fina+1);
		c = c.multiply(bb(10000));
		if(tt.equals(c)){return;}
		while(c.compareTo(tt)>0){
			tmp = write(tt,fil);
			tempo = tt.toString() + "," + Integer.toString(tmp);
			//try{Runtime.getRuntime().exec("cmd.exe /K \"echo "+ tempo +" >> counts.txt\"");}catch(Exception e){}
			if((tt.remainder(bb(1000))).equals(zz)){System.out.println(tempo);}
			//obj = obj + tempo;
			tt = tt.add(bb(1));
		}
	}
	static int 				write			(BigInteger ab,String fil)throws FileNotFoundException{
		BigInteger tt = ab.multiply(bb(10000));
		try{
			pri.fw = new FileWriter(fil + "a" + ab.toString()+ ".txt");
		}
		catch(java.io.IOException ioe){cc("sdgsgs");}
		ab = ab.add(bb(1));
		ab = ab.multiply(bb(10000));
		BigInteger rd[] = tt.divideAndRemainder(pk);
		int i = rev(rd[1].intValue());
		if(i==0){i++;}
		tt = rd[0].multiply(pk);
		tt = tt.add(bb(nums[i]));
		int len = nums.length;
		primeloader(ab);
		int z=0;
		BigInteger p[] = val.get(0);
		boolean bl = true;
		BigInteger bil;
		while(bl){
			if(! (pk.remainder(p[z])).equals( zz ) ){
				bl=false;
			}
			z++;
		}
		z--;
		if(flag){val.remove(0);val.addFirst(hatau(z,p));flag=false;cc("I just did hatau rn");}
		String obj = "";
		int count=0;
		while(tt.compareTo(ab)<=0){
			//cc(tt);
			if(isprime(tt)){
				//cc(tt.toString() + " is a prime number.");
				count++;
				obj = obj + tt.toString() + '\n';
			}
			tt = tt.add(bb(diffs[i]));
			i++;
			if(i==len){i=1;}
		}
		obj = "#" + Integer.toString(count) + '\n' + obj;
		//cc(obj);
		//cc("Count of this file is " + Integer.toString(count));
		ab = ab.divide(bb(10000));
		ab = ab.subtract(bb(1));
		//cc(fil+"a"+ab.toString()+".txt");
		try{pri.fw.write(obj);pri.fw.close();}
		catch(java.io.IOException ioe){cc("ssvdsv");} 
		return count;
		//cc("I have written file of " + ab.toString() + ".txt");
	}
	static BigInteger[] 	hatau			(int i,BigInteger op[])throws FileNotFoundException{
		int l = op.length - i;
		BigInteger[] ret = new BigInteger[l];
		for(int x=0;x<l;x++){
			ret[x] = op[i];
			i++;
		}
		return ret;
	}
	static void 			dis				(BigInteger a[])throws FileNotFoundException{
		for(int i=0;i<a.length;i++){
			cc(a[i]);
		}
	}
	static boolean 			isprime			(BigInteger pm)throws FileNotFoundException{
		int ll = val.size();
		int z=0;
		BigInteger a[] ;
		while(z<ll){
			a = val.get(z);
			int i =0;
			int l = a.length;
			while(i<l){
				if( (pm.remainder(a[i])).equals(zz) ){
					return false;
				}
				i++;
			}
			z++;
		}
		return true;
	}
	static void 			primeloader		(BigInteger bitg)throws FileNotFoundException{
		if(lim.compareTo(bitg)>=0){
			return;
		}
		BigInteger bigg = sqrt(bitg);
		int i =0;
		bigg = bigg.divide(bb(10000));
		//bigg = bigg.add(bb(1));
		int l = bigg.intValue();
		while(loaded<=l){
			val.add(give(loaded));
			cc("I have loaded file nmuber: " + Integer.toString(loaded));
			loaded++;
		}
		lim = bb(loaded);
		lim = lim.multiply(bb(10000));
		lim = lim.multiply(lim);
	}
	static BigInteger[] 	give			(int a) throws FileNotFoundException{
		String pastloca = pri.str;
		pri.str = str + "a" + Integer.toString(a/10000) + "//";
		String t = "ad";
		try{t = pri.read("a" + Integer.toString(a) + ".txt");}
		catch(java.io.FileNotFoundException fnfe){cc("akvbavkhbvkbmbfvmsvm s");}
		if(t.charAt(0) == 'a'){
			write(bb(a),pri.str);
			t = pri.read("a" + Integer.toString(a) + ".txt");
			if(t.charAt(0) == 'a'){cc("Infinite loop detected.");}
		}
		char c;
		int x=1;
		if(t.charAt(0)=='#'){
			while((c = t.charAt(x)) != '\n'){
				x++;
			}
		}
		t = t.substring(x+1);
		String temp[] = t.split("\r\n|\r|\n");
		int l = temp.length;
		BigInteger[] ret = new BigInteger[l];
		for(int i =0;i<l;i++){
			ret[i] = new BigInteger(temp[i]);
		}
		//val.add(ret);
		pri.str = pastloca;
		//cc("I have loadded file of a" + Integer.toString(a) + ".txt");
		return ret;
	}
	static BigInteger 		sqrt			(BigInteger vl) throws FileNotFoundException{
		BigInteger half = BigInteger.ZERO.setBit(vl.bitLength() / 2);
		BigInteger cur = half;
		while (true) {
			BigInteger tmp = half.add(vl.divide(half)).shiftRight(1);
			if (tmp.equals(half) || tmp.equals(cur))
				return tmp;
			cur = half;
			half = tmp;
		}
	}
	static void 			cc				(Object ab){
		pri.cc(ab);
	}
	static int 				rev				(int rem)throws FileNotFoundException{
		if(rem==0){return 0;}
		int i=1;
		int l = nums.length;
		while(i<l){
			if(rem<=nums[i]){
				return i;
			}
			i++;
		}
		return 0;
	}
	static String 			checkdir		(int fina)throws FileNotFoundException{
		File ff = new File(str +"a"+ Integer.toString(fina));
		if(ff.exists()){
			return ff.getAbsolutePath() + "\\";
		}
		try{
			ff.mkdir();
		}
		catch(java.lang.SecurityException s){}
		return ff.getAbsolutePath() + "\\";
	}
	static String 			seenumbers		(int fil) throws java.io.FileNotFoundException ,java.io.IOException{
		pri.fr = new FileReader(pri.str + "a" + Integer.toString(fil) + ".txt");
		String tmp = "";
		int cc = pri.fr.read();
		boolean bl = true;
		while(bl && (cc = pri.fr.read()) != -1){
			if(cc<(int)'0' || cc>(int)'9'){bl = false;}
			else{
				tmp = tmp + (char)(cc);
			}
		}
		int num1 = Integer.parseInt(tmp);
		bl = true;
		tmp = "";
		String fnm = str + "a" + Integer.toString(fil/10000) + "\\" + "a" + Integer.toString(fil) + ".txt";
		try{
			FileReader fr = new FileReader(fnm);
			cc = fr.read();
			while(bl && (cc = fr.read()) != -1){
				if(cc == (int)'\n'){bl = false;}
				else{
					tmp = tmp + (char)cc;
				}
			}
		}
		catch(java.io.IOException ioe){}
		int num2 = Integer.parseInt(tmp);
		//System.out.print(Integer.toString(fil));
		if(num1==num2){return "#";}
		else if(num1 > num2){cc(Integer.toString(fil) + ": older is higher");}
		else{cc(Integer.toString(fil) + " : newer is higher");}
		return Integer.toString(fil) ;
	}
	static void 			temp			() throws java.io.IOException{
		String loc = str + "a1\\";
		double total =0;
		double avg;
		FileReader fr ;
		String obj="";
		int x ;
		String tmp = "";
		int z=0;
		for(int i =10000;i<20000;i++){
			try{
				fr = new FileReader(loc + "a" + Integer.toString(i) + ".txt");
				x=fr.read();
				while((x=fr.read())>=(int)'0' && x<=(int)'9'){
					tmp = tmp + (char)x;
				}
				total = total + Integer.parseInt(tmp);
				avg = total/(z+1);
				obj = obj + Integer.toString(i) + "," + tmp + "," + Double.toString(avg) + '\n';
				tmp = "";
			}
			catch(java.io.FileNotFoundException fnfe){cc("kjbvkjv");}
			cc("Done with file number " + Integer.toString(i));
			z++;
		}
		try{
			FileWriter fw = new FileWriter(loc + "counts.txt");
			fw.write(obj);
			fw.close();
		}
		catch(java.io.FileNotFoundException fnfe){cc("adkjbakv");}
	}
	static BigInteger[] 	give			(BigInteger ab) throws FileNotFoundException{
		String pastloca = pri.str;
		BigInteger kpk = ab.divide(bb(10000));
		pri.str = str + "a" + kpk.toString() + "\\";
		String t = "ad";
		try{t = pri.read("a" + ab.toString() + ".txt");}
		catch(java.io.FileNotFoundException fnfe){cc("akvbavkhbvkbmbfvmsvm s");}
		if(t.charAt(0) == 'a'){
			write(ab,pri.str);
			t = pri.read("a" + ab.toString() + ".txt");
			if(t.charAt(0) == 'a'){cc("Infinite loop detected.");}
		}
		char c;
		int x=1;
		if(t.charAt(0)=='#'){
			while((c = t.charAt(x)) != '\n'){
				x++;
			}
		}
		t = t.substring(x+1);
		String temp[] = t.split("\r\n|\r|\n");
		int l = temp.length;
		BigInteger[] ret = new BigInteger[l];
		for(int i =0;i<l;i++){
			ret[i] = new BigInteger(temp[i]);
		}
		//val.add(ret);
		pri.str = pastloca;
		//cc("I have loadded file of a" + Integer.toString(a) + ".txt");
		return ret;
	}
	static String[] 		mm				() throws FileNotFoundException{
		String te = pri.str;
		pri.str = str;
		String t = pri.read("a623320000001.txt");
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
		pri.str = te;
		return temp;
	}
	static void 			test			(){
		for(int i = 90000;i<100000;i++){
			int c1 = getCount(str + "test\\",bb(i));
			int c2 = getCount(str + "a9\\",bb(i));
			if(c1==c2){cc(i + " file is okay.");}
			else{i=100000;cc("error occured !!!");}
		}
	}
	static int 				getCount		(String loca,BigInteger ab){
		String ss = "";
		try{
			FileReader fr = new FileReader(loca + "a" + ab + ".txt");
			int n0 = (int)'0';
			int n9 = (int)'9';
			fr.read();
			int z;
			ss = "";
			while((z = fr.read()) <=n9 && z >= n0){
				ss = ss + (char)z;
			}
		}
		catch(java.io.FileNotFoundException fnfe){cc("fgfxndn");}
		catch(java.io.IOException ioe){}
		return Integer.parseInt(ss);
	}
}