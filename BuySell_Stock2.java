class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int[][]dp = new int[n+1][2];
        for(int [] row : dp){
            Arrays.fill(row , -1);
        }

        return fun(a,n,0,0,dp);
    }

    public int fun(int []a , int n ,int i , int k , int[][]dp){
        if(i==n)return 0;

        //memo
        if(dp[i][k]!=-1){
            return dp[i][k];
        }

        if(k==0){ // buy state
        int c1 = fun(a,n,i+1,k+1,dp)-a[i];
        int c2 = fun(a,n,i+1,k,dp);
        return dp[i][k] = Math.max(c1,c2);

        }
        else{
            int c1 = fun(a,n,i+1,k-1,dp) + a[i];      // sell
            int c2 = fun(a,n,i+1,k,dp);
            return dp[i][k] = Math.max(c1,c2);
        }
    }
}
