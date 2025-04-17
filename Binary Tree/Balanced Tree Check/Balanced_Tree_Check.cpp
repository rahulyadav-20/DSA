#include<bits.stdc++.h>
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
};

class Solution {
    public:
    int height(Node* root, bool &valid){
        if(root == nullptr){
            return 0;
        }
        int l=height(root->left,valid);
        int r=height(root->right,valid);
          
        if(abs(l-r)>1){
            valid=0;
        }
        return 1+max(l,r);
    }
      
    bool isBalanced(Node* root) {
          // Code here
        bool valid=1;
        height(root,valid);
        return valid;
    }
};

int main(){
    Solution s;
    Node *root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    
    bool result = s.isBalanced(root);
    
    if(result) {
        cout << "The tree is balanced." << endl;
    } else {
        cout << "The tree is not balanced." << endl;
    }
    
    return 0;
}
