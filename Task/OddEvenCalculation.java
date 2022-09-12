package com.Task;

public class OddEvenCalculation {

	public static void main(String[] args) {

	    int a[]= {1,2,3,4,12,5,6,7,2,8,9,3};
	    int sum =0;
	    int multiply = 1;
	    for(int i=0;i<a.length;i++) {
	    	
	    	if(a[i] % 2 == 0) {
	    		
	    		multiply = a[i] * multiply;
	    	}else {
	    		sum += a[i];
	    	}
	    }
	    System.out.println("Odd : " + sum);
	    System.out.println("Even : " + multiply);
	}

}
