#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> ans;
        
        int start=0;
        int end=numbers.size()-1;

        while(start<=end){
            if(numbers[start]+numbers[end]==target){  //If the sum is equal to the target, return the indices
                ans.push_back(start+1); 
                ans.push_back(end+1);
                return ans;
            }
            else if(numbers[start]+numbers[end]>target){ //If the sum is greater than the target, decrement the end pointer
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
};
int main() {
    Solution sol;
    vector<int> numbers = {2, 7, 11, 15};
    int target = 9;
    vector<int> result = sol.twoSum(numbers, target);

    for (int i : result) {
        cout << i << " ";
    }
    cout << endl;

    return 0;
}
