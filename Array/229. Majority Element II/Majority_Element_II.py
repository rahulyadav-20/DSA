import math
from typing import List
class Solution:
    # Approach 1: Hashmap
    # Time complexity: O(n)
    # Space complexity: O(n)
    def majorityElement_1(self, nums: List[int]) -> List[int]:
        n=math.trunc(len(nums)/3)
        ans=[]
        hashmap={}
        for i in nums:
            if i in hashmap:
                hashmap[i]+=1
            else:
                hashmap[i]=1
        for i in hashmap:
            if(hashmap[i]>n):
                ans.append(i)
        return ans
    # Approach 2: Sorting
    # Time complexity: O(nlogn)
    # Space complexity: O(1)
    def majorityElement_2(self, nums: List[int]) -> List[int]:
        
        nums.sort()
        ans=[]
        check_num=nums[0]
        count=1
        n=math.trunc(len(nums)/3)
        print(nums)
        for i  in range(1,len(nums)):
            if(nums[i]==check_num):
                count+=1
            else:
                if(count>n):
                    ans.append(check_num)
                count=1
                check_num=nums[i]
        if(count>n):
            ans.append(check_num)
        return ans

    # Approach 3: Boyer-Moore Voting Algorithm
    # Time complexity: O(n)
    # Space complexity: O(1)



if __name__ =='__main__':
    sol=Solution()
    ans=sol.majorityElement_2([3,2,3])
    print(ans)




