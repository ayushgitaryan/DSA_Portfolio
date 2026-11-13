class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n= nums.length;
        int total=0;
 
        for(int num : nums){
            total+=num;
        }
        int max_end= nums[0];
        int min_end = nums[0];
       
        int maxi = nums[0];
        int mini = nums[0];

        for(int i=1;i<n;i++){
            int v1 = nums[i];
            int v2 = max_end + nums[i];
            int v3 = min_end + nums[i];
            max_end = Math.max(v1,v2);
            min_end = Math.min(v1,v3);
            
            maxi = Math.max(maxi , max_end);
            mini = Math.min(mini , min_end);

        }

            if(maxi < 0){
                return maxi;           // to handle all negative edge cases
            }

            
        
        return Math.max(maxi , (total-mini));
    }
}
