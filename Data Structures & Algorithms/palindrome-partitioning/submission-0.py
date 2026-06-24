class Solution:
    def isPali(self,s,i,j):
        while i < j:
            if s[i] != s[j]:
                return False
            i,j = i+1,j-1
        return True
    def partition(self, s: str) -> List[List[str]]:
        ans = []
        part = []

        def backtrack(i):
            if i == len(s):
                ans.append(part.copy())
                return
            
            for j in range(i,len(s)):
                if self.isPali(s,i,j):
                    part.append(s[i:j+1])
                    backtrack(j+1)
                    part.pop()
        
        backtrack(0)
        return ans