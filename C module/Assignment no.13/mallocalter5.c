#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *arr;
	int size;
	int i;
	
	printf("Enter array size : ");
	scanf("%d", &size);
	
	
	// Dynamic Memory Allocaton
	arr = (int*)malloc(size * sizeof(int));
	
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
	
	for(i = 0; i<size; i=i+2)
	
	{
		printf("%d ", arr[i]);
	}
	free(arr);
}