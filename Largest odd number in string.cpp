//steps
//1.Find largest number in string
//2.Find odd among it.



class Solution {
public:
    string largestOddNumber(string num) {
       int n=num.size();
       for(int i=n-1;i>=0;i--){
        if((num[i] -'0')%2!=0){
            return num.substr(0,i+1);
        }
       }
       return "";
            


    }
};

//Approach
we will use right pointer approach to find the first odd occurence then return the substring till there.
