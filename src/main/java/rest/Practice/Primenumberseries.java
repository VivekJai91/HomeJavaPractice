package rest.Practice;

import java.util.Scanner;

public class Primenumberseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
	     num=scan.nextInt();
	     
	     
	     System.out.println("The prime number are:");
	     
	     for(int i=2;i<num;i++)
	     {
	    	 if(!((i%2==0)))
	    	 {
	    		sum=i;
	    		i++;
	    	 }
	    	 System.out.print(" " +sum);
	     }

	}

}
