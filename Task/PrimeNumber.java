package com.Task;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		boolean prime =true;
	int i=2;
		while(i<n) {
				if(n%i==0) {
				prime=false;
					break;
				}
				
				++i;
		}
				if(prime) {
					System.out.println("Its a prime number");
			}else {
				System.out.println("Its not a prime");
			}
		}
	

}
