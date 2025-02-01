class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {


        // First merge both arrays

        vector<int>merged;

        for(int i=0;i<nums1.size();i++){
            merged.push_back(nums1[i]);
        }
         for(int i=0;i<nums2.size();i++){
            merged.push_back(nums2[i]);
        }

        // sort the merge arrays 

        sort(merged.begin(),merged.end());
        
        int total = merged.size();  // size of merged array

        if(total % 2==1){   // if the number of elements is odd
            return static_cast<double>(merged[total / 2]);

    //This is the simplest type of cast that can be used. It is a compile-time cast. It does things like implicit conversions between types (such as int to float, or pointer to void*), and it can also call explicit conversion functions.
        }
        else{ // if total number of elements are even
            int m1=merged[total / 2-1];
            int m2=merged[total / 2];
            return (static_cast<double>(m1) + static_cast<double>(m2)) / 2.0;
        }


    }
};
