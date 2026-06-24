class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        maxHeap = [-s for s in stones]
        heapq.heapify(maxHeap)

        while len(maxHeap) > 1:
            x = heapq.heappop(maxHeap)*(-1)
            y = heapq.heappop(maxHeap)*(-1)
            if x == y:
                continue
            elif x < y:
                heapq.heappush(maxHeap,(y-x)*-1)
            else:
                heapq.heappush(maxHeap,(x-y)*-1)
        if not maxHeap:
            return 0
        return maxHeap[0]*-1