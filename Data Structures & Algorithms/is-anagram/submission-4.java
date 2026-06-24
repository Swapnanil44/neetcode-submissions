class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] mpp = new int[26];
        for(int i=0;i<s.length();i++){
            mpp[s.charAt(i) - 'a']++;
            mpp[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(mpp[i] != 0){
                return false;
            }
        }
        return true;
    }
}
