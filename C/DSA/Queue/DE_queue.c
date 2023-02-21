#include<stdio.h>
#include<stdlib.h>

struct DEqueue
{
    int size;
    int r,f;
    int *arr;
};

void enqueueR(struct DEqueue *q, int x)
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

void enqueueF(struct DEqueue *q, int x)
{
    if(q->f <= -1)
    {
        printf("\n Queue Full from front\n");
    }
    else
    {
        q->f= q->f-1;
        q->arr[q->f+1] = x;
    }
}

int dequeueF(struct DEqueue *q)
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

int dequeueR(struct DEqueue *q)
{
    int a = -1;
    if(q->r == q->f)
    {
        printf("queue is empty from rear");
        return a;
    }
    else
    {
        q->r = q->r -1;
        a = q->arr[q->r+1];
        if(q->r == q->f)
        {
            q->r = q->f = -1;
        }
        return a; 
    } 
}


int main()
{
    struct DEqueue q;
    q.f = q.r =-1;
    q.size = 4;
    q.arr = (int*)malloc(q.size*sizeof(int));

    enqueueR(&q,10);
    enqueueR(&q,20);
    enqueueR(&q,30);
    
    printf("\ndequeueR is %d\n",dequeueR(&q));
    printf("\ndequeueF is %d\n",dequeueF(&q));

    enqueueF(&q,50);
    printf("\ndequeueF is %d\n",dequeueF(&q));
    

    return 0;
}
