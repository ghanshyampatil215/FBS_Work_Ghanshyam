//Reverse the Given Array (Using malloc())

#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *arr;
	int size, i, temp;
	
	printf("Enter array size : ");
	scanf("%d", &size);
	
	//dynamic Memory Allocation
	arr = (int*)malloc(size * sizeof(int));
	
	if(arr == NULL)
	{
		printf("Memory Allocation Failed..");
		return 0;
	}
	
	printf("Enter %d Element :\n", size);
	
	for(i = 0; i<size; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	//Reverse Array
	for(i = 0; i < size / 2; i++)
	{
		temp = arr[i];
		arr[i] = arr[size - 1 - i];
		arr[size - 1 - i] = temp;
	}
	
	printf("\nReversed Array:\n");
	
	for(i=0; i <size; i++)
	{
		printf("%d ", arr[i]);
	}
	free(arr);
	
	return 0;
}