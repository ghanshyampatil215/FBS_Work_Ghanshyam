#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *arr;
    int size, i;
    int sum = 0;

    printf("Enter array size: ");
    scanf("%d", &size);

    // Dynamic Memory Allocation
    arr = (int*)malloc(size * sizeof(int));

    if(arr == NULL)
    {
        printf("Memory Allocation Failed...");
        return 0;
    }

    printf("Enter %d Elements:\n", size);

    for(i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    // Calculate Sum
    for(i = 0; i < size; i++)
    {
        sum = sum + arr[i];
    }

    printf("\nSum of Array = %d", sum);

    free(arr);

    return 0;
}