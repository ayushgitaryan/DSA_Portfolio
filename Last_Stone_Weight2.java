class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int total=0;

        for(int num:stones){
            total+=num;
        }
        int target = total/2;
        boolean [][]dp = new boolean[n+1][target+1];

        //base case
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }

        //fill the table
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){

                //not pick 
                dp[i][j]=dp[i-1][j];
                // for taking
                if(stones[i-1]<=j){
                    dp[i][j]=dp[i][j] || dp[i-1][j-stones[i-1]];
                }
            }
        }

        // largest achievable sum<=target
        for(int s = target;s>=0;s--){
            if(dp[n][s]){
                return total - 2*s;
            }
        }
        return 0;
    }
}
