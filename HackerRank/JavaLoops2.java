package com.HackerRank;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            if((n>=1 && n<=15) && (a>=0 && a<=50) && (b>=0 && b<=50)) {
	            	int j=0;
	            	int sum=0;
	            	while(j<n) {
	            		int s =(int )Math.pow(2,j)*b;
	            		sum= sum+s;
	            		int ss=sum+a;
	            		System.out.print(ss+" ");
	            		j++;
	            	}
	            	System.out.println(" ");
	            }
	            
	        }
	        in.close();
	    }
	}


