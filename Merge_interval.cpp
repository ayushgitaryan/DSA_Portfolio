class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());  // sort all the intervals
        vector<vector<int>>ans;         //for storing result
        for(int i=0;i<n;i++){           // loop to access through the intervals
            if(ans.empty() || nums[i][0]>ans.back()[1]){  // if the interval is not off that part,it needs new interval
                ans.push_back(nums[i]);    // so simply push that interval in the answer
            }
            else{
                ans.back()[1]=max(ans.back()[1],nums[i][1]);     // if it can be in that range get the max
            }

        }
        return ans;
    }
};
