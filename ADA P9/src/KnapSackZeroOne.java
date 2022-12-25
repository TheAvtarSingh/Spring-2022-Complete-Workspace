

class Knapsach{
	public int getMaxValue(int capacity, int[] weight, int[] profit, int n) {
		
		int num=0;
		int dp[][] = new int[n+1][capacity+1];
		
		for(int i=0;i<=n;i++) {
			for(int wt = 0;wt<=capacity;wt++) {
				if(i==0||wt==0) {
					dp[i][wt]=0;
				}else if (weight[i-1]<=wt) {
					dp[i][wt] = max(profit[i-1]+dp[i-1][wt-weight[i-1]],dp[i-1][wt]);
				}else {
					dp[i][wt] = dp[i-1][wt];
				}
			}
			num = dp[i][capacity];
		}
		return num;
		
		
		// TODO Auto-generated method stub

	}

	public int max(int i, int j) {
		// TODO Auto-generated method stub
		if (i>j) {
			return i;
		}else {
			return j;
		}
	}
}


public class KnapSackZeroOne {
	public static void main(String[] args) {
    Knapsach knapsach = new Knapsach();
    int profit[] = new int[] { 100, 60, 120 };  
    int weight[] = new int[] { 20, 10, 30 };
    int capacity = 60;
    int n=profit.length;
    int maxVal = knapsach.getMaxValue(capacity,weight,profit,n);  
 
    System.out.println("The maximum value is: " + maxVal); 
   
	}
	
}
