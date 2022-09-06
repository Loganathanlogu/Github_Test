package com.Task;



public class oddAndevenCount {

	public static void main(String[] args) {
		
	
	    int a[]= {1,2,3,4,0,5,6,7,0,8,9,3};
	 
		int even=0,odd=0;
		int zero =0;
		
		for(int i=0;i<a.length;i++) {

			if(a[i]%2!=0) {
				odd++;
			}
			else if((a[i]%2 == 0) && (a[i] != 0))  {
				even++;
			}else {
				zero++;
			}
		    
		}
		System.out.println("Count of Odd number is:" + odd);
		System.out.println("Count of even number is:" + even);
		System.out.println("Count of Zero : " + zero);
		
	
	}
}


