class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> sset = new HashMap<Character,Integer>();
        for(char ch : s.toCharArray()){
            sset.put(ch,sset.get(ch) == null ? 1 : sset.get(ch) + 1);
        }
        for(char ch : t.toCharArray()){
            if(sset.get(ch) == null || sset.get(ch) == 0){
                return false;
            }
            sset.put(ch,sset.get(ch) - 1);
        }
        return true;
    }
}
