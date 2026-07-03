#include<stdio.h>

void oddEven(int arr[], int size);

int main()
{
	int arr[100], size,i;
	
	printf("enter array size: ");
	scanf("%d", &size);
	
	printf("enter %d element:\n", size);
	
	for(i=0; i<size; i++)
	{
		scanf("%d", &arr[i]);
	}
	oddEven(arr,size);
	
	return 0;
}

void oddEven(int arr[], int size)
{
	int i;
	
	printf("even number are: ");
	for(i=0; i<size; i++)
	{
		if(arr[i] % 2 ==0)
		{
			printf("%d ", arr[i]);
		}
	}
	
	
	printf("\nOdd number are: ");
	for(i=0; i<size; i++)
	{
		if(arr[i] % 2 !=0)
		{
			printf("%d ", arr[i]);
		}
	}
}