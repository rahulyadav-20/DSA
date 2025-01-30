#include <iostream>
using namespace std;

class Solution {
public:
    // Binary search
    // Time complexity: O(logn)
    // Space complexity: O(1)
    int mySqrt(int x) {
        if (x < 2) return x;
        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
};

int main() {
    Solution solution;
    int x=1000;
    cout << "The square root of " << x << " is " << solution.mySqrt(x) << endl;
    return 0;
}