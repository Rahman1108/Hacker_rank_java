import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String a = A.substring(0,1).toUpperCase();
        String a1 = A.substring(1).toLowerCase();
        String b = B.substring(0,1).toUpperCase();
        String b1 = B.substring(1).toLowerCase();
        System.out.println(a.concat(a1)+" "+b.concat(b1));
        
    }
}


/*
INPUT : 
hello world

OUTPUT : 
9
No
Hello Java

*/
