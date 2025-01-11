#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
class Solution
{
public:
    // Brute force approach
    // Time complexity: O(n^2)
    // Space complexity: O(1)
    int trapBruteForce(vector<int> &height)
    {
        int water = 0;
        for (int i = 1; i < height.size() - 1; i++)
        {
            int leftMax = 0, rightMax = 0;
            for (int j = 0; j <= i; j++) // left side
            {
                leftMax = max(leftMax, height[j]); // find the max height on the left side
            }
            for (int j = i; j < height.size(); j++) // right side
            {
                rightMax = max(rightMax, height[j]); // find the max height on the right side
            }
            water += min(leftMax, rightMax) - height[i];
        }
        return water;
    }

    // Optimized approach using extra space
    // Time complexity: O(n)
    // Space complexity: O(n)
    int trapOptimized(vector<int> &height)
    {
        int n = height.size();
        vector<int> leftMax(n), rightMax(n);
        int water = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++)
        {
            leftMax[i] = max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--)
        {
            rightMax[i] = max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++)
        {
            water += min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // Two pointer approach
    int trap(vector<int> &height)
    {
        int water = 0;
        int maxi = height[0];
        int index = 0;
        int leftMax = 0;
        int rightMax = height[height.size() - 1];

        for (int i = 1; i < height.size(); i++)
        {
            if (height[i] > maxi)
            {
                maxi = height[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++)
        {
            leftMax = max(leftMax, height[i]);
            int diff = min(leftMax, maxi) - height[i];
            if (diff > 0)
            {
                water += diff;
            }
        }
        for (int i = height.size() - 1; i > index; i--)
        {
            rightMax = max(rightMax, height[i]);
            int diff = min(rightMax, maxi) - height[i];
            if (diff > 0)
            {
                water += diff;
            }
        }
        return water;
    }
};

int main()
{
    Solution solution;
    vector<int> height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    cout << "Trapped water: " << solution.trap(height) << endl;
    return 0;
}