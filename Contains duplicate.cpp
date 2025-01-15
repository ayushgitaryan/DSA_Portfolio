class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        
        map<int,int>mpp;
         

         for(int i : nums){
            if(mpp[i]>=1)
                return 1;
                mpp[i]++;
         }
         
         
         return 0;
    }
    
    
};
