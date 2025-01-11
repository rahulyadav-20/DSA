from typing import List
class Solution:
    def trap(self, height: List[int]) -> int:
        water=0
        leftMax=[]
        rightMax=[]
        maxi=-1
        for i in range(0,len(height)):
            if(height[i]>maxi):
                maxi=height[i]
            leftMax.append(maxi)
        maxi=-1
        for i in range(len(height)-1,-1,-1):
            if(height[i]>maxi):
                maxi=height[i]
            rightMax.append(maxi)
        rightMax.reverse()

        for i in range(0,len(height)):
            diff=min(leftMax[i],rightMax[i])-height[i]
            if(diff>0):
                water+=diff
        return water
    
if __name__=='__main__':
    sol=Solution()
    height=[0,1,0,2,1,0,1,3,2,1,2,1]
    result=sol.trap(height)
    print(result)