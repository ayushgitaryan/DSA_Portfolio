class Solution {
public:
    string frequencySort(string s) {
      map<char,int>mpp;

      for(int i=0;i<s.size();i++){
        mpp[s[i]]++;
      }

      vector<pair<int,char>> v;
      for(auto it: mpp){
        v.push_back({it.second, it.first});
      }


      sort(v.begin(),v.end(),greater<pair<int,char>>());

      string res="";

      for(auto it:v){
        for(int i=0;i<it.first;i++){
            res+=it.second;
        }
      }

      return res;


    }
};
