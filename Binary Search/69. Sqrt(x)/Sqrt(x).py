class Solution:
    #Approach: Binary Search
    #Time Complexity: O(logn)
    #Space Complexity: O(1)
    def mySqrt(self, x: int) -> int:
        start=0
        end=x
        mid=int(start+(end-start)/2)
        ans=0
        while(start<=end):
            if(mid*mid==x):
                return mid
            elif(mid*mid<x):
                ans=mid
                start=mid+1
            else:
                end=mid-1
            mid=int(start+(end-start)/2)
        return ans

if __name__ == "__main__":
    sol = Solution()
    x = 10000
    print(f"The square root of {x} is {sol.mySqrt(x)}")
