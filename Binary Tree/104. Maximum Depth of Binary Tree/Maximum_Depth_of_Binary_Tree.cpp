#include<bits/stdc++.h>
using namespace std;
class Node{
    public:
        int data;
        Node *left;
        Node *right;
        Node(int val){
            data=val;
            left=NULL;
            right=NULL;
        }
}
 class Solution {
    public:
        void tree_height_count(TreeNode *root,int count,int &ans){
            if(root == NULL){
                return ;
            }
            count++;
            ans=max(count,ans);
            tree_height_count(root->left,count,ans);
            tree_height_count(root->right,count,ans);
        }
    
    public:
        int maxDepth(TreeNode* root) {
            int count=0;
            int ans=0;
            tree_height_count(root,count,ans);
            return ans;
    
        }
    };

int main(){
    Solution s;
    TreeNode *root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);
    int result = s.maxDepth(root);
    cout << "Maximum Depth of Binary Tree: " << result << endl;
    return 0;
}