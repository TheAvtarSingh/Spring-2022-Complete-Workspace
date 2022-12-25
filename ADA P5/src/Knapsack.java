import java.util.Scanner;

public class Knapsack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price[] = { 30, 40, 45, 77, 90 };
		int weight[] = { 5, 10, 15, 22, 25 };
		System.out.println("Specify the capacity you want = ");
		int capacity = sc.nextInt();
		int ActualProfit = 0;
		float ratio[] = new float[price.length];
		for (int i = 0; i < price.length; i++) {
			ratio[i] = (float) price[i] / weight[i];
		}
		for (int i = 0; i < price.length; i++) {
			for (int j = i + 1; j < price.length - 1; j++) {
				if (ratio[j] < ratio[j + 1]) {
					float c = ratio[j];
					ratio[j] = ratio[j + 1];
					ratio[j + 1] = c;

					int a = price[j];
					price[j] = price[j + 1];
					price[j + 1] = a;

					int b = weight[j];
					weight[j] = weight[j + 1];
					weight[j + 1] = b;
				}
			}
		}
		sc.close();
		int i;
		for (i = 0; i < ratio.length; i++) {
			if (capacity > 0 && capacity >= weight[i]) {
				capacity = capacity - weight[i];
				ActualProfit += price[i];
			} else
				break;
		}
		if (capacity > 0) {
			ActualProfit += (ratio[i] * capacity);
		}
		System.out.println("Profit :" + ActualProfit);
	}
	

}