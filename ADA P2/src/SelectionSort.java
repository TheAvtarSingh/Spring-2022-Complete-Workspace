
import java.util.Scanner;

public class SelectionSort {
	
	

	public static void main(String[] args) {
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		int temp;
		int n = sc.nextInt();
		System.out.println("Enter Elements of Array : ");
		int[] array = new int[n];
		for(int i=0;i<=n-1;i++) {
			array[i] = sc.nextInt();
		}
		

		long t1 = System.nanoTime();
		System.out.println("Time Before Sorting : "+t1/1000000);
		int min;
		for(int i=0;i<n-1;i++) {
			min = i;
			
			for(int j=i+1;j<n;j++) {
				if(array[j]<array[min]) {
					min=j;
				}
			}
			if(min!=i) {
				 temp = array[i];
				 array[i]=array[min];
				 array[min] = temp;
				 
			}
		}
		System.out.println("Sorted array is : ");
		for(int i=0;i<=n-1;i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
		long t2 = System.nanoTime();
		System.out.println("Time After Sorting : "+t2/1000000);
		long tdiff = t2-t1;
		System.out.println("Time Difference is : "+tdiff/1000000 +" Milliseconds");
		
sc.close();
	}

}
