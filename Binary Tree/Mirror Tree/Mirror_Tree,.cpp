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
      // Function to convert a binary tree into its mirror tree.
    void mirror(Node* node) {
          // code here
        if (node ==nullptr){
            return ;
        }
          
        Node *temp=node->left;
        node->left=node->right;
        node->right=temp;
          
        mirror(node->left);
        mirror(node->right);
    }
};

int main(){
    Solution s;
    Node *root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    
    s.mirror(root);
    
    // Print the mirrored tree (in-order traversal)
    std::function<void(Node*)> printInOrder = [&](Node* node) {
        if (node == nullptr) return;
        printInOrder(node->left);
        std::cout << node->data << " ";
        printInOrder(node->right);
    };
    
    printInOrder(root); // Output: 3 1 5 2 4
    
    return 0;
}