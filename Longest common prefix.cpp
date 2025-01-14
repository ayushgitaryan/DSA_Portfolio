//steps
//1.First we will sort the given array of strings
//2.after sorting we will compare the first string and last to check the prefix 

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
       string res;
       sort(strs.begin(),strs.end());
       int i=0;
       while(i<strs[0].length()  and strs[0][i]== strs[strs.size()-1][i]){
        res+=strs[0][i];
        i++;
       }
       return res;
        
    }
};
