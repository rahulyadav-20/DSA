from typing import List

class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:

        start=0
        end=len(arr)-1
        ans=len(arr)
        mid=start+(end-start)//2

        while(start<=end):
            if(arr[mid]-mid-1>=k):
                ans=mid
                end=mid-1
            else:
                start=mid+1
            mid=start+(end-start)//2

        return ans+k
        
if __name__ == "__main__":
    arr=[2,3,4,7,11]
    k=5
    obj=Solution()
    print(obj.findKthPositive(arr,k))
# Time Complexity: O(log n) 