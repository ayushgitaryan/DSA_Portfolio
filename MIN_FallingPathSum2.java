class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n= grid.length;
        int [][]dp = new int[n][n];

        for(int j=0;j<n;j++){           // first cell fixed
            dp[0][j] = grid[0][j];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int mini =Integer.MAX_VALUE;

                for(int k=0;k<n;k++){
                    if(j!=k){
                         mini=Math.min(mini , grid[i][j] + dp[i-1][k]);

                    }
                    dp[i][j]=mini;
                }

            }
        }
        int answer = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            answer = Math.min(answer, dp[n-1][j]);
        }
        return answer;
    }
}
