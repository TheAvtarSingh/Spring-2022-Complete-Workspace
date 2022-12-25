package series;

import java.util.Scanner;
public class factorial {
	int fact(int x) {
		if(x>1) {
			return(x*fact(x-1));
		}
		return 1;
	}

	public static void main(String[] args) {
		int n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer");
		n=sc.nextInt();
		factorial obj=new factorial();
		a=obj.fact(n);
		long startTime=System.nanoTime();
		long endTime=System.nanoTime();
		long totalTime=endTime-startTime;
		long secTime=totalTime/1000000;
		System.out.println("Factorial of "+n+" :"+a);
		System.out.println("\nTime taken "+totalTime+" nanosecond");
		System.out.println("Time taken "+secTime+" second");
		sc.close();
		}
	}
