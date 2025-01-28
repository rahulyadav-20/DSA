from typing import List
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:

        first=-1
        last=-1
      
        start=0
        end=len(nums)-1
        mid=int(start+(end-start)/2)
        while(start<=end):
            if(nums[mid]==target):
                first=mid
                end=mid-1
            elif(nums[mid]<target):
                start=mid+1
            else:
                end=mid-1
            mid=int(start+(end-start)/2)

        start=0
        end=len(nums)-1
        mid=int(start+(end-start)/2)
        while(start<=end):
            if(nums[mid]==target):
                last=mid
                start=mid+1
            elif(nums[mid]<target):
                start=mid+1
            else:
                end=mid-1
            mid=int(start+(end-start)/2)
        
        ans=[first,last]
        return ans

if __name__ == "__main__":
    s=Solution()
    nums=[5,7,7,8,8,10]
    target=8
    ans=s.searchRange(nums,target)
    print(ans)
        
        



        