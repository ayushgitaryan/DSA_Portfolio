class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right =0;

        for(int num : nums){
            left = Math.max(left,num);
            right  += num; 
        }

        while(left < right){
            int mid =  left +(right - left) /2;

            if(canDo(nums , k , mid)){
                right = mid;

            }
            else{
                left = mid +1;
            }
        }
        return left;
    }

    private boolean canDo(int [] nums , int k , int maxsum){
        int subarray =1;
        int current_sum = 0;

        for(int num : nums){
            if(current_sum + num > maxsum){
                subarray++;
                current_sum = num;
            }
            else{
                current_sum +=num;
            }
            if(subarray > k){
                return false;
            }
        }
        return true;
    }
}
