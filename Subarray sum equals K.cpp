class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n= nums.size();             //size of the array
        int count =0;                   //count to store the subarrays
        for(int i=0;i<n;i++){           // to run from starting index
            int sum=0;
            for(int j=i;j<n;j++){         //for end points

            
            sum+=nums[j];

            if(sum==k)
                count++;
            }
        }
        return count;

        
    }
};
