#include<stdio.h>

void leap(int *year);

int main()
{
    int year;

    printf("Enter Year : ");
    scanf("%d",&year);

    leap(&year);

    return 0;
}

void leap(int *year)
{
    if((*year % 400 == 0) || (*year % 4 == 0 && *year % 100 != 0))
        printf("Leap Year");
    else
        printf("Not Leap Year");
}