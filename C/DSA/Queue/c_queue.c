#include<stdio.h>
#include<stdlib.h>
struct c_queue
{
    int r;
    int f;
    int size;
    int *arr;
};

void enqueue(struct c_queue *q, int x)
{
    if((q->r+1)%q->size == q->f)
    {
        printf("\n Queue Full\n");
    }
    else
    {
        q->r = (q->r+1)%q->size;
        q->arr[q->r] = x;
    }
}

int dequeue(struct c_queue *q)
{
    int a = -1;
    if(q->r == q->f)
    {
        printf("queue is empty");
        return a;
    }
    else
    {
        q->f = (q->f + 1)%q->size;
        a = q->arr[q->f];
        //reset
        // if(q->r == q->f)
        // {
        //     q->r = q->f = -1;
        // }
        return a; 
    } 
}

int main()
{
    struct c_queue q;
    q.f=q.r=0;
    q.size=3; 
    q.arr = (int*)malloc(q.size*sizeof(int));


    enqueue(&q, 10);
    enqueue(&q, 11);
    enqueue(&q, 12);
    printf("%d is dequeued element\n",dequeue(&q));
    printf("%d is dequeued element\n",dequeue(&q));
    printf("%d is dequeued element\n",dequeue(&q));
    
    return 0;
}