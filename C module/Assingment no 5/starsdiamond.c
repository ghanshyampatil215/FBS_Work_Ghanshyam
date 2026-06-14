#include<stdio.h>

void main()
{
    int n = 4;

    // Upper Pyramid
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= n - i; j++)
        {
            printf(" ");
        }

        for(int k = 1; k <= 2 * i - 1; k++)
        {
            printf("*");
        }

        printf("\n");
    }

    // Lower Inverted Pyramid
    for(int i = 1; i < n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            printf(" ");
        }

        for(int k = 1; k <= 2 * (n - i) - 1; k++)
        {
            printf("*");
        }

        printf("\n");
    }
}