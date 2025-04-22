from typing import List

class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        for i in range(0,len(matrix)):
            for j in range(0,i+1):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]

        for i in range(0,len(matrix)):
            matrix[i].reverse()


if __name__ == "__main__":
    matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    Solution().rotate(matrix)
    print(matrix)  # Output: [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
#     # Perform an inner join with different column names