class Solution {
public:
    void reverseString(vector<char>& s) {

        int start=0;              //starting pointer
        int e= s.size()-1;         // end pointer
        while(start < e){
            swap(s[start++],s[e--]);
        }

        
    }
};
