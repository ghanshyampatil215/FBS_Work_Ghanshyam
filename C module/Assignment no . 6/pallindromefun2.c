#include <stdio.h>

// Function with no parameter and return type
int checkPalindrome()
{
    int n, temp, rev = 0, rem;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while (n != 0)
    {
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
    }

    if (temp == rev)
        return 1;   // Palindrome
    else
        return 0;   // Not Palindrome
}

int main()
{
    if (checkPalindrome())
        printf("Palindrome Number\n");
    else
        printf("Not a Palindrome Number\n");

    return 0;
}