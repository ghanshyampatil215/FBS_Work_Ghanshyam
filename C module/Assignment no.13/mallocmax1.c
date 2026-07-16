//Find Minimum and Maximum Number in Array (Using malloc)

#include<stdio.h>
#include<stdlib.h>

int main()
{
	int *arr;
	int size, i;
	int min, max;
	
	printf("Enter array size : ");
	scanf("%d", &size);
	
	//dynamic memory Allocation
	arr= (int*)malloc(size * sizeof(int));
	
	if(arr == NULL)
	{
		printf("Memory Allocation Failed...");
		return 0;
	}
	
	printf("Enter %d Elements :\n", size);
	
	for(i=0; i<size; i++)
	{
		scanf("%d", &arr[i]);
	}
	min = arr[0];
	max = arr[0];
	
	for(i=1; i<size; i++)
	{
		if(arr[i] < min)
		{
			min = arr[i];
		}
		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	
	printf("\nMinimum Number = %d", min);
	printf("\nMaximum Number = %d", max);
	
	free(arr);
	return 0;
}