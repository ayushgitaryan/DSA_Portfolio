class Solution {
public:
    bool isAnagram(string s, string t) {
      /* sort(s.begin(),s.end());
       sort(t.begin(),t.end());
       return s==t;*/
       unordered_map<char,int>cnt;

       for(auto x: s){
        cnt[x]++;
       }
       for(auto x: t){
        cnt[x]--;
       }

       for(auto x: cnt){
        if(x.second !=0){
            return 0;
        }
       }
       return 1;


    }
};
