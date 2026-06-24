class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mpp = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = Arrays.toString(charArray);
            if(mpp.get(sortedS) == null){
                mpp.put(sortedS, new ArrayList<>());
            }
            mpp.get(sortedS).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}
