import sys
class Solution:

    #Time Complexity: O(n)
    #Space Complexity: O(1)
    #Function to find the sum of contiguous subarray with the largest sum.

    def maxSubArraySum(self,arr):
        sum=0
        maxi=-sys.maxsize -1   #initializing maxi with minimum value
        for i in range(0,len(arr)):
            sum+=arr[i]
            maxi=max(sum,maxi)
            if(sum<0):         #if sum is negative then we will make it 0 as it will not contribute to the maximum sum
                maxi
                sum=0
        return maxi
                

if __name__ =='__main__':
    sol=Solution()
    arr=[-2,1,-3,4,-1,2,1,-5,4]
    print(sol.maxSubArraySum(arr))
    