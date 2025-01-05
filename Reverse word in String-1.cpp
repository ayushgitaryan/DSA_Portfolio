/* Take two string temp and ans
   Iterate the string to check
   if there is character  store it in temp and move forward
   if space is encountered then break the loop and come out
   Now check if temp(size)> 0 check ans== 0 then ans=temp
   else ans= temp+ ans
   Return ans

*/


class Solution {
public:
    string reverseWords(string s) {
       int n=s.size();
       int i=0;
       string ans="";

       while(i<n){
        string temp="";
        
        while(s[i]==' ' && i<n){
            
            i++;
        }
        while(s[i]!= ' ' && i<n){
            temp+=s[i];
            i++;
        }
          if(temp.size()>0){
            if(ans.size()== 0){
                ans=temp;
            }
            else
            ans=temp+ " "+ans;
          }

       }
       return ans;
        
    }
};
