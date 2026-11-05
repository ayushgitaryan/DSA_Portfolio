class Solution {
    public int longestPalindrome(String s) {
        char [] ch = s.toCharArray();
        HashMap<Character , Integer> map = new HashMap<>();

        for(char c : ch){
            map.put(c , map.getOrDefault(c,0)+1);
        }
        boolean odd = false;
        int count = 0;

        for(int freq : map.values()){
            if(freq % 2==0){
                count+=freq;           // if even characters add all
            }
            else{
                count += freq-1; 
                odd = true;      // if odd then -> freq -1;
            }

        }
        if(odd){
            count +=1;      // add 1 extra odd character to put in the middle
        }
        return count;
    }
}
