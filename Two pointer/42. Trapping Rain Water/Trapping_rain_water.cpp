#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
class Solution
{
public:
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