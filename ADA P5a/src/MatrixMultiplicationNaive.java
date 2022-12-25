public class MatrixMultiplicationNaive {
	public static void main(String args[]) {
//creating two matrices    
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

//creating another matrix to store the multiplication of two matrices    
		int c[][] = new int[3][3]; // 3 rows and 3 columns
		long t1 = System.nanoTime();
		System.out.println("Time Before Multiplication : " + t1 / 1000000);
//multiplying and printing multiplication of 2 matrices    
		
		System.out.println("Multiplied Array : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} // end of k loop

				

				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line

			
		}
		long t2 = System.nanoTime();
		System.out.println("Time After Multiplication : " + t2 / 1000000);
		long tdiff = t2 - t1;
		System.out.println("Time Difference is : " + ((tdiff / 1000000) + 1) + " Milliseconds");
	}
}
