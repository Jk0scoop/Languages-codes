#include<stdio.h>
#define N 5
int arr[N];
int TOP = -1;

void push(int);
void Display(void);
int pop(void);
int peep(int);
void change(int,int);

int main()
{
    push(1);
    push(4);
    push(1);
    change(0,50);
    Display();
    return 0;
}

void push(int x)
{
    if(TOP >= N - 1)
    {
        printf("\n Stack is Overflow \n");
    }
    else
    {
        TOP = TOP + 1;
        arr[TOP] = x;
    }
}

void Display()
{
    printf("\n");
    for(int i = 0; i<=TOP;i++)
    {
        printf("%d,", arr[i]);
    }
    printf("\n");
}

int pop(void)
{
    if(TOP <= -1)
    {
        printf("\n Stack Underflow \n");
        return -1;
    }
    else
    {
        TOP = TOP - 1;
        // printf("%d,",arr[TOP+1]);
        return arr[TOP+1];
    }
}

int peep(int index)
{
    if(TOP - index < 0)
    {
        printf("\n Stack Overflow \n");
        return -1;
    }
    else
    {
        return arr[TOP - index];
    }
}

void change(int index, int val)
{
    if(TOP - index < 0)
    {
        printf("\n Stack Overflow \n");
    }
    else
    {
        arr[TOP - index] = val;
    }
}