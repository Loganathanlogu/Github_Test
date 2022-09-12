package com.Task;

import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
				int num=0;
				String prime="";
				for(int i=1;i<=50;i++) {
					int count=0;
					for(num=i;num>=1;num--) {
						if(i%num==0) {
							count=count+1;
						}
					}
					if(count==2) {
						prime=prime+i+" ";			
						}
				}
				System.out.println("The prime numbers: ");

				System.out.println(prime);

		

	}

}
