class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)

        def prevSmallerElement():
            pse = [-1]*n
            stack = []

            for i in range(n):
                while stack and heights[stack[-1]] >= heights[i]:
                    stack.pop()
                if stack:
                    pse[i] = stack[-1]
                stack.append(i)
            return pse

        def nextSmallerElement():
            nse = [n]*n
            stack = []

            for i in range(n-1,-1,-1):
                while stack and heights[stack[-1]] >= heights[i]:
                    stack.pop()
                if stack:
                    nse[i] = stack[-1]
                stack.append(i)
            return nse
        
        pse = prevSmallerElement()
        nse = nextSmallerElement()
        maxArea = 0
        for i in range(n):
            area = heights[i]*(nse[i]-pse[i]-1)
            maxArea = max(area,maxArea)
        return maxArea