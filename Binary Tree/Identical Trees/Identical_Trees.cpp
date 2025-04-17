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
};

class Solution {
    public:
      // Function to check if two trees are identical.
      bool isIdentical(Node *r1, Node *r2) {
          // Your Code here
          if(r1==nullptr && r2==nullptr){
              return 1;
          }
          if((r1==nullptr && r2 != nullptr) || (r1!=nullptr && r2==nullptr)){
              return 0;
          }
          
          if(r1->data != r2->data){
              return 0;
          }
          
          return isIdentical(r1->left, r2->left) && isIdentical(r1->right, r2->right);
      }
  };

int main(){
    Solution s;
    Node *root1 = new Node(1);
    root1->left = new Node(2);
    root1->right = new Node(3);
    
    Node *root2 = new Node(1);
    root2->left = new Node(2);
    root2->right = new Node(3);
    
    bool result = s.isIdentical(root1, root2);
    
    if(result) {
        cout << "The trees are identical." << endl;
    } else {
        cout << "The trees are not identical." << endl;
    }
    
    return 0;
}