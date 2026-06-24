class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            int[] mpp = new int[26];
            for(int i=0;i<s.length();i++){
                mpp[s.charAt(i)-'a']++;
            }
            String key = Arrays.toString(mpp);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList(res.values());
    }
}
