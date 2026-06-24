class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = set()
        candidates.sort()

        def dfs(i,cur,total):
            if total == target:
                ans.add(tuple(cur))
                return
            if i == len(candidates) or total > target:
                return
            
            cur.append(candidates[i])
            dfs(i+1,cur,total+candidates[i])
            cur.pop()

            dfs(i+1,cur,total)
        cur = []
        dfs(0,cur,0)
        res = [list(combination) for combination in ans]
        return res
