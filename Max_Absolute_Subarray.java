class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int max_end = nums[0];
        int min_end = nums[0];
        int ans=Math.abs(nums[0]);
        for(int i=1;i<n;i++){
            int v1 = nums[i];
            int v2 = max_end + nums[i];
            int v3 = min_end + nums[i];
           max_end= Math.max(v1, Math.max(v2,v3));
          min_end= Math.min(v1, Math.min(v2,v3));
          ans = Math.max(ans , Math.max(max_end , Math.abs(min_end)));
        }
        return ans;
    }
}
