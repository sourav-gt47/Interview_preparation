import java.io.*;
import java.util.Scanner;


public class Duplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int count;
     String s1 = sc.nextLine();

     char ans[] = s1.toCharArray();
     char ans1[] = new char[s1.length()];
     int freq[] = new int[s1.length()];
     int k=0;
  

    for(int i=0;i<ans.length;i++){
          count=1;

        for(int j=i+1;j<ans.length;j++){
  
            if(ans[i] == ans[j] && ans[i] != ' ')
                    {  ++count;
                      ans[j]='0';
                    }

        }

           if(count > 1 && ans[i]!='0')
                freq[k] = count;
                ans1[k] = ans[i];
                k++;
    }


    //print
     for (int i=0;i<freq.length;i++){
              if(freq[i] > 1)
         System.out.print(ans1[i] + ":" + freq[i] + " ");

     }
      System.out.println();

  }

}