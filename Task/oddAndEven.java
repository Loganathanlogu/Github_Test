package com.Task;

public class oddAndEven {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,11,12};
		System.out.println("The Odd numbers is: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
			System.out.println(a[i]);
			}
		}
		System.out.println("The even number is: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}

