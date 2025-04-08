#include <bits/stdc++.h>
using namespace std;

class Solution {
    public:
        int search(vector<int>& nums, int target) {
            int start=0;
            int end=nums.size()-1;
            int mid=start+(end-start)/2;
    
            while(start<=end){
                cout<<mid<<endl;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[start]<=nums[mid]){
                    if(target<=nums[mid] && target>=nums[start]){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }else{
                    if(nums[mid]<=target && target<=nums[end]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
                mid=start+(end-start)/2;
            }
            return -1;
        }
    };

int main() {
    vector<int> nums = {4,5,6,7,0,1,2};
    int target = 0;
    Solution sol;
    int result = sol.search(nums, target);
    cout << "Index of target " << target << " is: " << result << endl;
    return 0;
}