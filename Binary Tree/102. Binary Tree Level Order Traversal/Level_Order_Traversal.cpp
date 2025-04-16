#include<bits.stdc++.h>
using namespace std;
class TreeNode{
    public:
        int val;
        TreeNode *left;
        TreeNode *right;
        TreeNode(int x) : val(x), left(nullptr) ,right(nullptr){}
}
 class Solution {
    public:
        vector<vector<int>> levelOrder(TreeNode* root) {
            vector<vector<int>> result;
            if(root == nullptr){
                return result;
            }
    
            queue<TreeNode*> q;
            TreeNode* temp=root;
            q.push(temp);
    
            while(!q.empty()){
                int size=q.size();
                vector<int> level;
    
                for(int i=0; i<size; i++){
                    temp=q.front();
                    q.pop();
                    level.push_back(temp->val);
                    if(temp->left){
                        q.push(temp->left);
                    }
                    if(temp->right){
                        q.push(temp->right);
                    }
                }
                result.push_back(level);
            }
            return result;
        }
    };


int main(){
    Solution s;
    TreeNode *root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);
    
    vector<vector<int>> result = s.levelOrder(root);
    
    for(const auto& level : result) {
        for(int val : level) {
            cout << val << " ";
        }
        cout << endl;
    }
    
    return 0;
}