class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        mpp = [0 for _ in range(0,26)]
        for i in range(0,len(s)):
            mpp[ord(s[i]) - ord('a')] += 1
            mpp[ord(t[i]) - ord('a')] -= 1
        
        for i in range(0,26):
            if mpp[i] != 0:
                return False
        return True