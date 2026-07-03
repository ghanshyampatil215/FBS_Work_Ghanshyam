#include<stdio.h>

void findMinMax(int arr[], int size)
{
	int i;
	int min = arr[0];
	int max = arr[0];
	
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
	printf("minimum number = %d\n", min);
	printf("Maximun Number = %d\n", max);
}
int main()
{
	int arr[100], size,i;
	
	printf("enter array size :");
	scanf("%d", &size);
	
	printf("enter %d element:\n", size);
	
	for(i = 0; i<size; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	findMinMax(arr, size);
	return 0;
}