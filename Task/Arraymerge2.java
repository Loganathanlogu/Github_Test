package com.Task;
public class Arraymerge2 {

	public static void main(String[] args) {
		
		int[] num1= {10,20,3,40,80};
		int[] num2= {22,90,50,4};
		
		int length1=num1.length;
		int length2=num2.length;
		int[] result=new int[length1+length2];
		int i=0,j=0,k=0;
		int x;
		System.out.print("First Array:");
		for(x=0;x<num1.length;x++) {
		System.out.print(num1[x]+" ");
		}
	
		System.out.print("\nSecond Array:");

		for(x=0;x<num2.length;x++) {
			System.out.print(num2[x]+" ");
	
	}
	
			
		   while (i < length1 && j < length2) {
		      
		            result[k++] = num1[i++];
		     
	            result[k++] = num2[j++];
		      }
		while(i<length1)
			result[k++]=num1[i++];
		while(j<length2)
			result[k++]=num2[j++];

		
	
		
		System.out.print("\nAfter merge: ");
		for(i=0;i<result.length;i++) {
			
			System.out.print(result[i]+" ");
		}
		
		
		

	}

}
