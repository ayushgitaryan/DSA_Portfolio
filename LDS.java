class Solution {                                                              //LDS = Largest divisible subset
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int [] dp = new int[n];
        int  [] prev = new int[n];  // to store the previous subset chain
        Arrays.fill(dp,1);
        Arrays.fill(prev ,-1);
        int maxi = 0;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j]+1 ){
                    dp[i] = dp[j]+1;
                    prev[i] = j;
                }
            }
            if(dp[i] > dp[maxi]) maxi=i;
        }
        for(int i=maxi ; i>=0;i=prev[i]){
            ans.add(nums[i]);
        }
        return ans;
    }
}
