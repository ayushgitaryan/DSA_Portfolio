class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n= nums.size();
        int s=0;                   //s is starting index
        int l=n-1;               // l is last index

        while(s<=l){
            int mid = s+(l-s)/2;

            if(nums[mid]== target){
                return mid;
            }
            else if( nums[mid]<target){
                s=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return -1;
    }
};
