package com.HackerRank;


import java.util.Scanner;

public class reverseString {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev="";
            for(int j=A.length()-1;j>=0;j--) {
            	rev=rev+A.charAt(j);
            }
                if(rev.equals(A)){
                    System.out.println("Yes");
            }
                else {
                	System.out.println("No");
                }
        }
}

