class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& s) {

        unordered_map<string, vector<string>>mpp;

        for(auto x:s){
            string word=x;
            sort(word.begin(),word.end());
            mpp[word].push_back(x);
        }

        vector<vector<string>>ans;

        for(auto x: mpp){
            ans.push_back(x.second);

        }
        return ans;

        
    }
};
