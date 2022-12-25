package series;

import java.util.Scanner;

public class fibonacci {
	public static int fib(int m) {
		if(m<=1)
			return  m;
		else
			return fib(m-1)+fib(m-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any number");
		n=sc.nextInt();
		System.out.println("The first "+n+" Fibonnacci numbers are");
		for(int  i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
		long startTime=System.nanoTime();
		long endTime=System.nanoTime();
		long totalTime=endTime-startTime;
		long secTime=totalTime/1000000;
		System.out.println("\nTime taken is "+totalTime+" nanosecond");
		System.out.println("Time taken is "+secTime+" second");
		sc.close();
		}
	}
