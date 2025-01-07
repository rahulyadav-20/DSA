def generate(numRows):
    triangle = [] #

    for row_num in range(numRows):
        row = [None for _ in range(row_num + 1)] # Create a list of None values with the length of the current row
        row[0], row[-1] = 1, 1 # Set the first and last elements of the row to 1

        for j in range(1, len(row) - 1):
            row[j] = triangle[row_num - 1][j - 1] + triangle[row_num - 1][j] # Calculate the value of the current element

        triangle.append(row)

    return triangle

# Example usage:

def print_triangle(triangle):
    for row in triangle:
        print(' ' * (len(triangle) - len(row)), end='')
        print(' '.join(map(str, row)))



if __name__=='__main__':
    numRows = 5
    print_triangle(generate(numRows))
