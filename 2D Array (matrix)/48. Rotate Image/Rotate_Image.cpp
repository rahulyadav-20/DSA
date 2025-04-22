#include<bits/stdc++.h>
using namespace std;
// Rotate the image by 90 degrees clockwise
class Solution {
    public:
        void rotate(vector<vector<int>>& matrix) {
            
            // Transpose the matrix
            // Swap elements across the diagonal
            for(int i=0; i<matrix.size(); i++){
                for(int j=0; j<i+1; j++){
                    swap(matrix[i][j],matrix[j][i]);
                }
            }
            // Reverse each row of the transposed matrix
            // Swap elements across the middle row
            for(int i=0; i<matrix.size(); i++){
                reverse(matrix[i].begin(),matrix[i].end());
            }
            
    }
};

int main(){
    Solution s;
    vector<vector<int>> matrix = {{1,2,3},{4,5,6},{7,8,9}};
    s.rotate(matrix);
    for(auto i:matrix){
        for(auto j:i){
            cout<<j<<" ";
        }
        cout<<endl;
    }
    return 0;
}