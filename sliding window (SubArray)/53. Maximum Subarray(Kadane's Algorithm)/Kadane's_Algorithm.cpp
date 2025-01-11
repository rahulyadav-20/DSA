#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int maxSubArray(vector<int>& nums) {
    int max_current = nums[0];
    int max_global = nums[0];

    for (size_t i = 1; i < nums.size(); ++i) {
        max_current = max(nums[i], max_current + nums[i]);
        if (max_current > max_global) {
            max_global = max_current;
        }
    }

    return max_global;
}

int main() {
    vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    cout << "Maximum subarray sum is " << maxSubArray(nums) << endl;
    return 0;
}

