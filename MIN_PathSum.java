class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int [m][n];
        dp[0][0]=grid[0][0];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                 if(i==0 && j==0)continue;

                int top = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;

               

                if(i>0){
                    top = dp[i-1][j];
                } //come from top

                if(j>0){ // from left
                    left = dp[i][j-1];
                }
                dp[i][j] = grid[i][j]+ Math.min(top , left);
            }
        }
        return dp[m-1][n-1];

    }
}
