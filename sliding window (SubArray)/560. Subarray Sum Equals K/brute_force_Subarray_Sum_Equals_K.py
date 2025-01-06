from typing import List
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0
        for i in range(0,len(nums)):
            sum=0
            for j in range(i,len(nums)):
                sum+=nums[j]
                if(sum==k):
                    count+=1
        return count
    
if __name__ == '__main__':
    nums=[1,2,3,6,7,3,9,-9,4,-2,2-4]
    k=3
    s=Solution()
    print(s.subarraySum(nums,k))