public class Que4 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        int N = 4;

        System.out.println(equalPartition(arr, N));
        
    }

    static int equalPartition(int[] arr, int N) {
        int sum = 0;
        for(int i = 0;i < N; i++)
            sum = sum + arr[i];
        if(sum%2 == 1)
            return 0;
        sum = sum / 2;
        boolean[][] dp = new boolean[N+1][sum+1];
	    
	    for(int i = 0;i < dp.length; i++)
	        dp[i][0] = true;
	    
	    for(int i = 1; i < dp.length; i++)
	        dp[0][i] = false;
	     
	    for(int i = 1;i <= N;i++){
	        for(int j = 1;j <= sum;j++){
	            if(arr[i - 1] > j){
	                dp[i][j] = dp[i - 1][j];
	            }
	            else{
	                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
	            }
	        }
	    }
	    return (dp[N][sum] ? 1:0);
    }
}
    

