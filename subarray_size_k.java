class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int cnt = 0;
        int target = threshold * k ;

        if(sum>=target){
            cnt++;
        }

        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];

           
        
        if(sum>=target){
            cnt++;
        }
     }
           
     return cnt;
    }
}
