#include <stdio.h>

// Function with parameter and return type
int checkEvenOdd(int num)
{
    if (num % 2 == 0)
        return 1;   // Even
    else
        return 0;   // Odd
}

int main()
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (checkEvenOdd(n))
        printf("%d is Even.\n", n);
    else
        printf("%d is Odd.\n", n);

    return 0;
}