#include <bits/stdc++.h>
using namespace  std;
class Node{
    public:
    int data;
    Node *left, *right;
    
    Node(int value){
        data = value;
        left = right = NULL;
    }
};

int main(){
    int x;
    cout<<"Enter the element: ";
    cin>>x;
    int first,second;
    queue<Node*>q;
    Node *root=new Node(x);
    q.push(root);
    
    
    while(!q.empty()){
        
        Node *temp=q.front();
        q.pop();
        //left node
        cout<<"Enter the left value of "<<temp->data<<": "<<endl;
        cin>>first;
        if(first !=-1){
            temp->left=new Node(first);
            q.push(temp->left);
        }
        cout<<"Enter the right value of "<<temp->data<<": "<<endl;
        cin>>second;
        if(second !=-1){
            temp->right=new Node(second);
            q.push(temp->right);
        }
    }
    
}