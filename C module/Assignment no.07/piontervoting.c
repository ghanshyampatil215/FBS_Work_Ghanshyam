#include <stdio.h>

// Function with parameter and without return type
void checkVote(int *age)
{
    if (age >= 18)
        printf("Eligible for Voting.\n");
    else
        printf("Not Eligible for Voting.\n");
}

int main()
{
    int *age;

    printf("Enter your age: ");
    scanf("%d", &age);

    checkVote(age);

    return 0;
}