package com.Task;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
    int	sum=-0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    long n=sc.nextLong();
    int i=1;
    while(i<=n/2) {
    	if(n%i==0) {
    		sum=sum+i;
    	}
    	i++;
    }
    if(sum==n) {
    	System.out.println(n+" is a Perfect number");
    }else {
    	System.out.println(n+" is a not Perfect number");
    }
	

	}

}
