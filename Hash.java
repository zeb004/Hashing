import java.util.*;
import java.io.*;
import java.lang.*;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.NoSuchElementException;
import java.util.Scanner; 
public class Hash {
public static void main(String[] args) throws NumberFormatException,IOException,NoSuchElementException {
PrintWriter outFile = new PrintWriter("Store.txt");
String[] names= {"Jim","John","Jack","Brad","Kim","Sue"};
//Collision handling. Converts to ascii, so only collisons
//that occur happen when same name is in array, so it
//adds an aditional number to the end of a name if 
//it is the same as another, like a form of linear
//collision handling
int mod=1;
for (int j=0;j<names.length;j++)
  for (int k=j+1;k<names.length;k++)
    if (k!=j && names[k] == names[j]) {
System.out.println("Duplicates");
names[j]=(names[j]+mod);
mod++;
}

for(int i=0;i<names.length;i++) {
String key=names[i];
byte[] hash=key.getBytes("US-ASCII");
outFile.println(key+" "+hash);

}
outFile.flush();
File file = new File("Store.txt");
    Scanner kb = new Scanner(System.in);
    Scanner input = new Scanner(file);
System.out.println("Enter a name to search:");
String name = kb.nextLine();
final Scanner scanner = new Scanner(file);
while (input.hasNextLine()) {
while (scanner.hasNextLine()) {
final String lineFromFile = scanner.nextLine();
   if(lineFromFile.contains(name)) { 
System.out.println(lineFromFile);
} else {
System.out.println("Not Found");
}
}
}
}
}
