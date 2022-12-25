package DivideandConquer;

import java.util.Scanner;

public class QuickSort {
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; //Taking end element as pointer
        int i = (low-1); //Lower index
        for (int j=low; j<high; j++) //Loop to check elements
        {
            // If current element is smaller than or equal to pivot
           if (arr[j] <= pivot)
            {
                i++;
  
                // then swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
  
        // swap the starting element with pivot element
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
  
        return i+1; //Returning next pointer to check the condition
    }
  
  
  
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        { //Checking until mid condition
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); //Low to pointer -1
            sort(arr, pi+1, high); //Pointer +1 to end
        }
    }
  

  
  
    public static void main(String args[])
    {
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
    	

  
        QuickSort ob = new QuickSort();
        ob.sort(array, 0, n-1);

    	System.out.println("Sorted array is : ");
    	for(int i=0;i<=n-1;i++) {
    		System.out.print(array[i] +" ");
    	}
    	System.out.println();
    	long t2 = System.nanoTime();
    	System.out.println("Time After Sorting : "+t2/1000000);
    	long tdiff = t2-t1;
    	System.out.println("Time Difference is : "+tdiff/1000000 + " Milliseconds");
    	sc.close();
    }

}
