class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        minHeap = [-n for n in nums]
        heapq.heapify(minHeap)

        ans = minHeap[0]
        while k > 0:
            ans = heapq.heappop(minHeap)
            k -= 1
        return ans*-1