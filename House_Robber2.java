class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
     }
        if(n==1){
            return nums[0];
        }
      
      int case1 = robrange(nums , 0 , n-2);  // exclude last;
      int case2 = robrange(nums , 1 , n-1);  // exclude 1st

      return Math.max(case1 , case2);
    }

  int robrange(int []nums , int start , int end){
        int prev2=0;
        int prev1=0;

        for(int i=start ; i<=end ; i++){
            int pick  = nums[i]+prev2;
            int notpick = prev1;

            int current = Math.max(pick , notpick);

            prev2=prev1;
            prev1 = current;
        }
        return prev1;
    }
}
