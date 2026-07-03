#include<stdio.h>

void reverseArray(int arr[], int size);

int main()
{
	int arr[100],size,i;
	
	printf("enter array size: ");
	scanf("%d", &size);
	
	printf("enter %d element:\n", size);
	
	for(i=0; i<size; i++)
	{
		scanf("%d", &arr[i]);
	}
	reverseArray(arr,size);
	printf("reversed array:\n");
	
	for(i=0; i<size; i++)
	{
		printf("%d ", arr[i]);
	}
	
	return 0;
}
void reverseArray(int arr[], int size)
{
	int i,temp;
	
	for(i=0; i<size/2; i++)
	{
		temp = arr[i];
		arr[i] = arr[size - 1-i];
		arr[size - 1- i] = temp;
	}
}