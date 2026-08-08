class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int [] pcount = new int[26];
        int [] window = new int [26];
        if(s.length() < p.length()){
            return ans;
        }

        for(char ch : p.toCharArray()){
            pcount[ch-'a']++;
        }

        int k = p.length();

        for(int i=0;i<k;i++){
            window[s.charAt(i)-'a']++;            // first window
        }
        if(Arrays.equals(window , pcount)){
            ans.add(0);
        }

        //slide window
        for(int i=k;i<s.length();i++){
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i-k) - 'a']--;

            if(Arrays.equals(window , pcount)){
                ans.add(i-k+1);
            }
        }
        return ans;

    }
}
