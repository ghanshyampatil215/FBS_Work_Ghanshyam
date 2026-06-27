#include<stdio.h>

int prime(int no);

int main()
{
    int no, res;

    printf("Enter a number: ");
    scanf("%d", &no);

    res = prime(no);

    if(res == 0)
    {
        printf("Prime Number");
    }
    else
    {
        printf("Not Prime Number");
    }

    return 0;
}

int prime(int no)
{
    int i, count = 0;

    for(i = 1; i <= no; i++)
    {
        if(no % i == 0)
        {
            count++;
        }
    }

    if(count == 2)
        return 0;
    else
        return 1;
}