#include<stdio.h>
#include<stdlib.h>

//node Structure
struct node
{
    int data;
    struct node* left;
    struct node* right;
};

//createNode Function
struct node* createNode(int data)
{
    struct node* n;
    n->data = data;
    n->left = NULL;
    n->right = NULL;
    return n;
}


int main()
{
    struct node* p = createNode(2);
    struct node* p1 = createNode(5);
    struct node* p2 = createNode(3); 
    //Linking Nodes
    p->left = p1;
    p->right = p2;


    // struct node* p;
    // p = (struct node *)malloc(sizeof(struct node));
    // p->left=NULL;
    // p->right=NULL;

    // struct node* p1;
    // p1 = (struct node *)malloc(sizeof(struct node));
    // p1->left=NULL;
    // p1->right=NULL;

    // struct node* p2;
    // p2 = (struct node *)malloc(sizeof(struct node));
    // p2->left=NULL;
    // p2->right=NULL;

    // //Linking Nodes
    // p->left = p1;
    // p->right = p2;
    return 0;
}
