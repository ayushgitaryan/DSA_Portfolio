class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char [] ch = magazine.toCharArray();
        HashMap<Character , Integer>map = new HashMap<>();
        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : ransomNote.toCharArray()){
            if(map.getOrDefault(c,0) == 0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}
