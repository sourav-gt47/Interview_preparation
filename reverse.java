import java.io.*;
import java.util.Scanner;

class reverse{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
      String rev = "";
    for(int i=0;i<str.length();i++){

     char ch = str.charAt(i);
       rev = ch + rev;

    }
    System.out.println("REVERSE ORDER STRING::" + rev);  
    sc.close();

 }

}