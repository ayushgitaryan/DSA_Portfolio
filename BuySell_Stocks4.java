class Solution {
    public int maxProfit(int x, int[] a ) {
        int n = a.length;
        int [][]dp = new int[n+1][2*x];
        for(int [] row : dp){
            Arrays.fill(row ,-1);
        }
        return fun(a,n,0,0,x,dp);
        
    }

    public int fun(int [] a , int n , int i , int k ,int x, int[][]dp){
        if(i==n || k==2*x)return 0;

        if(dp[i][k]!=-1){
            return dp[i][k];
        }

        if(k%2==0){ // buy
            int c1 = fun(a,n,i+1,k+1,x,dp) - a[i];
            int c2 = fun(a,n,i+1,k,x,dp);
            return dp[i][k] = Math.max(c1,c2);
        }
        else{
            int c1 = fun(a,n,i+1,k+1,x,dp)+a[i];
            int c2 = fun(a,n,i+1,k,x,dp);
            return dp[i][k] = Math.max(c1,c2);
        }
    } 
}
