#include<stdio.h>
#include<stdlib.h>

int main ()
{
	int *arr;
	int i , size;
	
	printf("Enter array size : ");
	scanf("%d", &size);
	
	//dymanic memory Allocation
	arr = (int *)malloc(size * sizeof(int));
	
	if(arr == NULL)
	{
		printf("Memory Allocation Failed...");
		return 0;
	}
	
	printf("Enter %d Element :\n", size);
	
	for(i = 0; i<size; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	printf("\nEven Number are : ");
	for(i=0; i<size; i++)
	 { 
	    if(arr[i] % 2 == 0)
	    {
	    	printf("%d ", arr[i]);
		}
	
	}
	printf("\nOdd Numbers are : ");
	
	for(i=0; i<size; i++)
	{
		if(arr[i] % 2 != 0)
		{
			printf("%d ", arr[i]);
		}
	}
    free(arr);
    return 0;
}

