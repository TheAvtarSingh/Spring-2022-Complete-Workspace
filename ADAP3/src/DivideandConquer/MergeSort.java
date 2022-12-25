package DivideandConquer;

import java.util.Scanner;

public class MergeSort {
	// TODO Auto-generated method stub
	//Divide Method
	public static void divide(int arr[],int start,int end) {
		 int mid = (start + end)/2;
		 if (start<end) {
		 divide(arr, start,mid); //Dividing until start<end
		 divide(arr, mid+1, end); //Dividing other half
		 conquer(arr, start,mid, end); //Merging the Two Arrays
		 }
	}
	//Merging Method
private static void conquer(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
	
	int n = (end-start+1);
	int temp[] = new int[n]; 
	//Creating a temperory array which will just sort and then we will copy the Sorted Elements into main array
	int p1 = start;//pointer1
	int p2 = mid+1;//pointer2
	int x = 0; //Pointer to enter element into temp array
	while (p1<=mid && p2<=end) { //Both the Pointer covering the arrays
		if (arr[p1]<=arr[p2]) { //If element in 1st array is smaller - Add in temp and increment pointer
			temp[x] = arr[p1];
			x++;
			p1++;
		}else {
			temp[x] = arr[p2]; //If element in 1st array is greater - Add in temp and increment pointer
			x++;
			p2++;
		}
		
	}
	//For the leftout Elements Copy them as it is
	while (p1<=mid) { //If left in First Half
		temp[x] = arr[p1];
		x++;p1++;
	}
	while (p2<=end) { //if left in second half
		temp[x] = arr[p2];
		x++;p2++;
	}	
	//Cpoying temp array values into original array
	for (int i = 0,j=start; i < temp.length; i++,j++) {
		arr[j] = temp[i];
	}
	}
public static void main(String[] args) {
	System.out.println("Enter Size of Array : ");
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	System.out.println("Enter Elements of Array : ");
	int[] array = new int[n];

	for(int i=0;i<=n-1;i++) {
		array[i] = sc.nextInt();
	}
	
	

	long t1 = System.nanoTime();
	System.out.println("Time Before Sorting : "+t1/1000000);
	divide(array, 0, n-1);
System.out.println("Sorted Array is : ");
	for(int i=0;i<=n-1;i++) {
		System.out.print(array[i]+ " ");
	}
	System.out.println();
	long t2 = System.nanoTime();
	System.out.println("Time After Sorting : "+t2/1000000);
	long tdiff = t2-t1;
	System.out.println("Time Difference is : "+tdiff/1000000 + " Milliseconds");
	sc.close();
}
}
