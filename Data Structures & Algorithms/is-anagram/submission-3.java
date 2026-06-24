class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> stMap = new HashMap<>();
        HashMap<Character, Integer> tsMap = new HashMap<>();

        for(int i=0; i < s.length();i++){
            stMap.put(s.charAt(i),stMap.getOrDefault(s.charAt(i),0)+1);
            tsMap.put(t.charAt(i),tsMap.getOrDefault(t.charAt(i),0)+1);
        }
        return stMap.equals(tsMap);
    }
}
