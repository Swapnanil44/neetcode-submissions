class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        String sortedS = new String(charArrayS);
        String sortedT = new String(charArrayT);

        return sortedS.equals(sortedT);
    }
}
