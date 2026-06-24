class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        
        def subset(nums,sub,res,i):
            if i == len(nums):
                res.append(sub[:])
                return
            
            sub.append(nums[i])
            subset(nums,sub,res,i+1)
            sub.pop()

            subset(nums,sub,res,i+1)
        sub = []
        res = []
        subset(nums,sub,res,0)
        return res