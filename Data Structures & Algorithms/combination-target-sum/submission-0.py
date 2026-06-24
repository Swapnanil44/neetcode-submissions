class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        subset = []

        def dfs(i,target):
            if i == len(nums):
                if target == 0:
                    res.append(subset.copy())
                return
            
            if nums[i] <= target:
                subset.append(nums[i])
                dfs(i,target-nums[i])
                subset.pop()
            
            dfs(i+1,target)
        
        dfs(0,target)
        return res