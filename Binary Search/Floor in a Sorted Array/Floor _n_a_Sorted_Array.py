
#Approaching the problem using Binary Search
# Time Complexity: O(log n)
# Space Complexity: O(1)
def findFloor(self, arr, x):
    # Your code here
    start = 0
    end = len(arr) - 1
    mid = start + (end - start) // 2
    
    while start <= end:
        if arr[mid] == x:
            ans = mid
            start = mid + 1
        elif arr[mid] <= x:
            start = mid + 1
        else:
            end = mid - 1
        mid = start + (end - start) // 2
    
    ans = mid
    return ans

__inti__ = '__main__'
arr = [1, 2, 8, 10, 10, 12]
x = 5
ans = findFloor(arr, x)
print(ans)
#Output: 2
