import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            String str[] = new String[3];
            int integer[] = new int[3];
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
               System.out.printf("%-15s%03d\n", s1, x);
            }
            
            System.out.println("================================");

    }
}

/* 
INPUT : 

java 100
cpp 65
python 50


OUTPUT   : 

================================
java           100 
cpp            065 
python         050 
================================
*/
