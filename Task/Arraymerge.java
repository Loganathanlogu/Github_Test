package com.Task;

import java.util.Arrays;

public class Arraymerge {

	public static void main(String[] args) {
		
		int[] a1= {10,20,30,40,50};
		int[] a2= {15,25,35,45};
		
	int length1=a1.length;
	int length2=a2.length;
	
	int[] result=new int[length1+length2];
	//using copy method
	System.arraycopy(a1,0,result,0,length1);
	System.arraycopy(a2,0,result,length1,length2);
	System.out.println(Arrays.toString(result));
		}
		
		
		
	
		
	}


