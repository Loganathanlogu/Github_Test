package com.HackerRank;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String S, int k) {
        String smallest = "";
        String largest = "";
      
        String maxString = S.substring(0, k);
        String minString = S.substring(0, k);
        
        for (int i=1;i<=S.length()-k;++i){
            if (maxString.compareTo(S.substring(i,i+k))<0)
                maxString = S.substring(i,i+k);
            if (minString.compareTo(S.substring(i,i+k))>0)
                minString = S.substring(i,i+k);
        }
        
        System.out.println(minString);
        System.out.println(maxString);
        
        return smallest + "\n" + largest;
          }
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
  
    
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}


