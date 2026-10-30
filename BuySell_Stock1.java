class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        //int k=2;      // we have two transactions
        int [][]dp = new int[n+1][2]; 
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
        int gain = fun(a,n,0,0,dp);
        return gain;
    }

    public int fun(int [] a , int n , int i, int k , int [][]dp){
        if(i==n || k==2){
            return 0;
        }

        // if(k==0){
        //     return 0;
        // }
        if(dp[i][k]!=-1){
            return dp[i][k];
        }

        if(k==0){ // means buy
        int c1 = fun(a,n,i+1,k+1,dp) - a[i];          // buy
        int c2 = fun(a,n,i+1,k,dp);            //do nothing
       return  dp[i][k] = Math.max(c1,c2);
        }
        else{
            int c1 = a[i];
            int c2 = fun(a,n,i+1,k,dp);
            return dp[i][k] = Math.max(c1,c2);
        }
    }
}
