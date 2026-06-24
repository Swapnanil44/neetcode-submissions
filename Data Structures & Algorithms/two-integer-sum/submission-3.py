class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mpp = {}
        for i in range(0,len(nums)):
            diff = target - nums[i]
            if diff in mpp:
                return [mpp[diff],i]
            mpp[nums[i]] = i
        
        