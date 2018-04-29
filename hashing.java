//Both A and B option are in here because if I find the time I will bang out the A option
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class hashing {
	 public static void main(String[] args){
		 int i=0;
		 String[] keys=new String[257];
		 long[] values=new long [257];
		 try (Scanner input = new Scanner(new File("Words.txt"))) {
		 while(input.hasNextLine())
		 {
		    String data = input.nextLine();
		    //data=data.replaceAll(" ","0");
		    keys[i]=data;
					  i++;
}
}  catch (IOException e) {
				e.printStackTrace();
		}





for(int g=0;g<keys.length;g++) {
	String temp=keys[g];
	//System.out.println(temp);
	long modTemp=(temp.charAt(7)+temp.charAt(13));
	long modTemp1=(temp.charAt(14)*temp.charAt(15)*temp.charAt(8));
	long modTemp2=modTemp+modTemp1;
	long address=modTemp2%128;
	//long modTemp=(temp.charAt(0)+temp.charAt(3));
	//long modTemp1=(temp.charAt(1)*temp.charAt(2)*temp.charAt(4));
	//long modTemp2=modTemp+modTemp1;
	//long address=modTemp2%128;
	//System.out.println(address);
	values[g]=address;

}

for(int d=0;d<values.length;d++) {
	//System.out.println(values[d]);
}
	long probe;
	long probe1;
	int size=128;
	double d=0.45;
	double e=0.83;
	float factor1=(float)e;
	float factor=(float)d;
		  Hashtable A = new Hashtable(size,factor);
		  Hashtable B = new Hashtable(size,factor1);
		  //Linear Collision Handling
/*
		  for(int p=0;p<58;p++) {
			  long code=values[p];
			  if(A.containsKey(code)==false) {//If not in table, add
			  A.put(keys[p],values[p]);
			  probe=-1;
		  } else { //else, look and find, loop to 0 if needed
			  if(code==(127))
				  probe=0;
				  else
				  probe=code+1;
			  }
			  while((probe!=-1&&probe!=code)) { //continue untill entire table visited
				  if((A.containsKey(code)==false)) {
				  A.put(keys[p],values[p]);
			      probe=-1;
			  } else {
				  if(probe==(127))
				  probe=0;
				  else
				  probe++;
			  }
		  }

}
*/

long[] loc=new long[257];
long z=1;
//for(int n=0;n<keys.length;n++) {
//if (Arrays.asList(values).contains()) {
//	z=z++;
	//} else {
	//	loc[n]=(n);
	//}
//}

//for(int y=0;y<keys.length;y++) {
	//System.out.println(loc[y]);
//}

//Random Probe
//int R=10;
/*
int R=25;
for (int u = 0; u < 58; u++) {
R=R*5;
R=R%512;
R=R/4;
A.put(keys[u],R);
}
*/
		int num=1;
		  Enumeration names;
		names=A.keys();
		while(names.hasMoreElements()) {
			String key=(String)names.nextElement();
		    //System.out.println(num+"   "+"Key:"+key+"    Value:"+A.get(key));
		 	num++;
			String data=("Key:"+key+"    Value:"+A.get(key));
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(99999);
			//for (int b = 0; b < keys.length; b++) {
			// writeToRandomAccessFile("Hash.txt",randomInt,data);
//}


		}

		for(int o=0;o<=106;o++) {
			//linear probe
				long code1=values[o];
				  if(B.containsKey(code1)==false) {//If not in table, add
				B.put(keys[o],values[o]);
				 probe1=-1;
				} else { //else, look and find, loop to 0 if needed
				 if(code1==(127))
				  probe1=0;
				  else
				 probe1=code1+1;
				 }
				while((probe1!=-1&&probe1!=code1)) { //continue untill entire table visited
				  if((B.containsKey(code1)==false)) {
				  B.put(keys[o],values[o]);
				    probe1=-1;
				 } else {
				  if(probe1==(127))
				  probe1=0;
				  else
				  probe1++;
				 }
		  }

		  }
		  System.out.println(B);


//Random Probe
/*
		  int Q=10;
		  for (int w = 0; w < 106; w++) {
		  Q=Q*5;
		  Q=Q%512;
		  Q=Q/4;
		  B.put(keys[w],Q);
	  }
	  */

		   Enumeration names1;
		  		names1=B.keys();
		  		while(names1.hasMoreElements()) {
		  			String key=(String)names1.nextElement();
		  			//System.out.println(num+"   "+"Key:"+key+"    Value:"+B.get(key));
		  		//	num++;
		  			//String data1=("Key:"+key+"    Value:"+B.get(key));
		  			//Random randomGenerator = new Random();
					//int randomInt = randomGenerator.nextInt(99999);
					//for (int b = 0; b < keys.length; b++) {
					//writeToRandomAccessFile("Hash.txt",randomInt,data1);
//}
		}

	  }
	    public static void writeToRandomAccessFile(String file, int position, String record) {
	          try {
	              RandomAccessFile fileStore = new RandomAccessFile(file, "rw");

	              // moves file pointer to position specified
	              fileStore.seek(position);

	              // writing String to RandomAccessFile
	              fileStore.writeUTF(record);

	              fileStore.close();

	          } catch (IOException e) {
	              e.printStackTrace();
	          }
	      }


}
