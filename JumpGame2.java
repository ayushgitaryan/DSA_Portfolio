class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int reach = 0;
        int jump=0;
        int maxReach=0;
        for(int i=0;i<n-1;i++){
            maxReach = Math.max(maxReach , i+nums[i]);
            if(reach == i){
                jump++;
                reach = maxReach;

            }

            if(reach>=n-1){
                break;
            }
        }
        return jump;
    }
}
