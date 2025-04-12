class Solution:
    
    #Function to find minimum number of pages.
    def findPages(self, arr, k):
        #code here
        if(len(arr)<k):
            return -1
        maxi=arr[0]
        Sum=0
        for i in arr:
           Sum=Sum+i
           maxi=max(maxi,i)
        
        start=maxi
        end=Sum
        mid=start+(end-start)//2
        ans=-1
        while(start<=end):
            count=1
            page=0
            #print(mid)
            for i in arr:
                page=page+i
                if(page>mid):
                    count=count+1
                    page=i
            
            if(count<=k):
                ans=mid
                end=mid-1
            else:
                start=mid+1
            mid=start+(end-start)//2
        
        return ans



if __name__ == "__main__":
    arr = [12, 34, 67, 90]
    k = 2
    solution = Solution()
    result = solution.findPages(arr, k)
    print("The minimum number of pages:", result)