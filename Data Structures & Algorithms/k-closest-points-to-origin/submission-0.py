class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        minHeap = []
        for x,y in points:
            minHeap.append([x**2+y**2,x,y])
        
        heapq.heapify(minHeap)
        ans = []
        while k > 0:
            dist, x , y = heapq.heappop(minHeap)
            ans.append([x,y])
            k -= 1
        return ans       
