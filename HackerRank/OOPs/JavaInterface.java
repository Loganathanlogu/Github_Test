package com.HackerRank.OOPs;

import java.util.Scanner;



interface AdvancedArithmetic{
		  int divisor_sum(int n);
		}

		//Write your code here
class cal implements AdvancedArithmetic{

			@Override
			public int divisor_sum(int n) {

				int sum=0;
				int i=0;
				for(i=1;i<=n;i++) {
					if(n%i==0) {
						sum=sum+i;
						
					}
				}

				return (sum);
			}
	
}

	public class JavaInterface {
		    public static void main(String []args){
		    	 cal my_calculator = new cal();
		         System.out.print("I implemented: ");
		         ImplementedInterfaceNames(my_calculator);
		         Scanner sc = new Scanner(System.in);
		         int n = sc.nextInt();
		         System.out.print(my_calculator.divisor_sum(n) + "\n");
		       	sc.close();
		    }
		    /*
		     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
		     */
		    static void ImplementedInterfaceNames(Object o){
		        Class[] theInterfaces = o.getClass().getInterfaces();
		        for (int i = 0; i < theInterfaces.length; i++){
		            String interfaceName = theInterfaces[i].getName();
		            System.out.println(interfaceName);
		        }
		    }
		}


