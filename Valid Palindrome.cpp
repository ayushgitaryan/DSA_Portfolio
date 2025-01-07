// steps
//1. store valid characters
//2. convert to lowercase
//3. check palindrome



class Solution {
public:

bool valid(char ch){
    if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
        return 1;
    }
    return 0;
}

    char tolowercase(char ch){
         if((ch>='a' && ch<='z') || (ch>='0'&& ch<='9')) {
          return ch;
         }
    else{
        char temp = ch - 'A'+'a';
        return temp;
    }
    }

bool checkpalindrome(string s){
    int st=0;
        int e=s.size()-1;
        while(st<e){
            if(s[st]!=s[e]){
                return 0;
            }
            else{
                st++;
                e--;
            }
        }
        return 1;
}

    bool isPalindrome(string s) {
        string temp="";

        // to remove unnecessary characters
        for(int j=0;j<s.size();j++){
            if(valid(s[j])){
                temp.push_back(s[j]);
            }
        }

        // to call lower case function
        for(int j=0;j<temp.size();j++){
            temp[j]=tolowercase(temp[j]);
         }

        // to call checkplaindrome function
         return checkpalindrome(temp);
    }
};
