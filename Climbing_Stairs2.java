class Solution {
    public int climbStairs(int n, int[] costs) {
        

        int [] dp = new int[n+1];

        dp[0] = 0;

        for(int i=1;i<=n;i++){
            int cost1=Integer.MAX_VALUE;
            int cost2=Integer.MAX_VALUE;
            int cost3=Integer.MAX_VALUE;

            if(i>=1){
                cost1 = dp[i-1]+costs[i-1] + 1;

            }
            if(i>=2){
                cost2 = dp[i-2]+costs[i-1]+4;

            }
            if(i>=3){
                cost3 = dp[i-3]+costs[i-1]+9;

            }
            dp[i] = Math.min(cost1, Math.min(cost2,cost3));
        }
        return dp[n];

    }
}
