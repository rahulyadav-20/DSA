from typing import List

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        ans=[]

        start=0
        end=len(numbers)-1

        while(start<end):
            if(numbers[start]+numbers[end]==target):
                ans.append(start+1)
                ans.append(end+1)
                return ans
            elif(numbers[start]+numbers[end]>target):
                end-=1
            else:
                start+=1
        return ans

if __name__ == "__main__":
    solution = Solution()
    numbers = [2, 7, 11, 15]
    target = 9
    result = solution.twoSum(numbers, target)
    print(result)