class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] rArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(rArray);
        return Arrays.equals(sArray,rArray);
    }
}
