class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;

        int top=0;
        int right=matrix[0].size()-1;
        int bottom=matrix.size()-1;
        int left=0;

        while(top<=bottom && left<=right){
            for(int i=top; i<=right; i++){
                ans.push_back(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                ans.push_back(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }           
        }
        return ans;
    }
};

int main() {
    Solution sol;
    vector<vector<int>> matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    vector<int> result = sol.spiralOrder(matrix);
    for (int num : result) {
        cout << num << " ";
    }
    return 0;
}