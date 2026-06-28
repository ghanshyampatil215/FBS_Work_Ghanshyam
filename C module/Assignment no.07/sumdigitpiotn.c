#include<stdio.h>

void sumDigit(int *n);

int main()
{
    int num;

    printf("Enter Number : ");
    scanf("%d",&num);

    sumDigit(&num);

    return 0;
}

void sumDigit(int *n)
{
    int sum=0,rem,no;

    no=*n;

    while(no!=0)
    {
        rem=no%10;
        sum=sum+rem;
        no=no/10;
    }

    printf("Sum = %d",sum);
}