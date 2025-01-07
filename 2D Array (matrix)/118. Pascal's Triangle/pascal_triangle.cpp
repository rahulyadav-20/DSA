#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        ans.push_back({1});

        for (int i=1; i<numRows; i++){
            vector<int> a;
            a.push_back(1);
            for(int j=0; j<ans[i-1].size()-1; j++){
                int data=ans[i-1][j]+ans[i-1][j+1];
                a.push_back(data);
            }
            a.push_back(1);
            ans.push_back(a);
        }
        return ans;

        
    }
};

int main(){
    Solution Sol;
    int numRows=5;
    vector<vector<int>> ans=Sol.generate(numRows);
    for(int i=0; i<ans.size(); i++){
        // Print leading spaces
        for(int j=0; j<numRows-i-1; j++){
            cout << " ";
        }
        for(int j=0; j<ans[i].size(); j++){
            cout  << ans[i][j] << " ";
        }
        cout << endl;
    }
}