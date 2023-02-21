#include<stdio.h>
#include<stdlib.h>

struct queue
{
    int size;
    int r,f;
    int *arr;
};

void enqueue(struct queue *q, int x)
{
    if(q->r == q->size-1)
    {
        printf("\n Queue Full\n");
    }
    else
    {
        q->r = q->r+1;
        q->arr[q->r] = x;
    }
}

int dequeue(struct queue *q)
{
    int a = -1;
    if(q->r == q->f)
    {
        printf("queue is empty");
        return a;
    }
    else
    {
        q->f = q->f + 1;
        a = q->arr[q->f];
        //reset
        if(q->r == q->f)
        {
            q->r = q->f = -1;
        }
        return a; 
    } 
}


int main()
{
    struct queue q;
    q.f = q.r =-1;
    q.size = 2;
    q.arr = (int*)malloc(q.size*sizeof(int));

    enqueue(&q, 10);
    enqueue(&q, 11);
    printf("%d is dequeued element\n",dequeue(&q));
    printf("%d is dequeued element\n",dequeue(&q));
    enqueue(&q, 12);
    printf("%d is dequeued element\n",dequeue(&q));

    return 0;
}
