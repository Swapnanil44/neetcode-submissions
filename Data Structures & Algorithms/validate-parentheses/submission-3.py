class Solution:
    def isValid(self, s: str) -> bool:
        openToClosed = {"(":")","{":"}","[":"]"}
        stack = []
        for c in s:
            if c in openToClosed:
                stack.append(c)
            else:
                if not stack:
                    return False
                if c != openToClosed[stack[-1]]:
                    return False
                else:
                    stack.pop()
        
        return not stack