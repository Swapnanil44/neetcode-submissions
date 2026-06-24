class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mpp.get(target-nums[i]) != null){
                return new int[]{mpp.get(target-nums[i]),i};
            }else{
                mpp.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
