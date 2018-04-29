import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class hashingTRY {
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
	//System.out.println(address);
	values[g]=address;

}

for(int d=0;d<values.length;d++) {
	//System.out.println(values[d]);
}

	int size=128;
	double d=0.45;
	double e=0.83;
	float factor1=(float)e;
	float factor=(float)d;
		  Hashtable A = new Hashtable(size,factor);
		  Hashtable B = new Hashtable(size,factor1);
		  for(int p=0;p<values.length;p++) {
			  A.put(keys[p],values[p]);
		  }
		  Enumeration names;
		names=A.keys();
		while(names.hasMoreElements()) {
			String key=(String)names.nextElement();
			System.out.println("Key:"+key+"    Value:"+A.get(key));
		}
		for(int o=0;o<values.length;o++) {
					  B.put(keys[o],values[o]);
		  }
		   Enumeration names1;
		  		names1=B.keys();
		  		while(names1.hasMoreElements()) {
		  			String key=(String)names1.nextElement();
		  			//System.out.println("Key:"+key+"    Value:"+B.get(key));
		}

	  }
}