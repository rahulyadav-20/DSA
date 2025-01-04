#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSum=INT_MIN;
        int prt1=0;
        int prt2=0;
        int sum=0;

        while(prt1<nums.size() && prt2<nums.size()){
            sum+=nums[prt2];
            if(sum>maxSum)maxSum=sum;
            if(sum<0){
                sum-=nums[prt1];
                prt1=prt2;
                prt2++;
                sum=0;
            }else{
                prt2++;
            }
        }
        return maxSum;
        
    }
};

int main() {
    Solution sol;
    vector<int> inputArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result = sol.maxSubArray(inputArray);
    cout << "Maximum subarray sum is " << result << endl;
    return 0;
}

