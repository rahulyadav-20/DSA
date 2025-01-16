#Your task is to complete this function
 
class Solution:
    #Approach:Brute Force
    #Time Complexity:O(n^2)
    #Space Complexity:O(1)
    def maxLen(self, arr):
        maxi=0
        for i in range(0,len(arr)):
            sum=0
            for j in range(i,len(arr)):
                sum+=arr[j]
                if(sum==0):
                    maxi=max(maxi,j-i+1)
        return maxi
    
    #Approach:Optimal
    #Time Complexity:O(n)
    #Space Complexity:O(n)
    def maxLen_1(self, arr):
        maxi=0
        sum=0
        Map={0:-1}
        
        for i in range(0,len(arr)):
            sum+=arr[i]
            if(sum==0):
                diff=i-Map[sum]
                maxi=max(maxi,diff)
            elif Map.get(sum) is not None:
                diff=i-Map[sum]
                maxi=max(maxi,diff)
            else:
                Map.update({sum:i})
        return maxi
        

if __name__=='__main__':
    arr=[15, -2, 2, -8, 1, 7, 10, 23,0,0,0,0,0,0,0]
    ob=Solution()
    print(ob.maxLen_1(arr))