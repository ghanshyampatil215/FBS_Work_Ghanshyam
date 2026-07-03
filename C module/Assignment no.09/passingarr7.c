#include<stdio.h>
void sumArray(int arr[],int brr[], int crr[],int size);
int main()
{
	int arr[100], brr[100], crr[100];
	int size,i;
	
	printf("enter array size:");
	scanf("%d", &size);
	
	printf("enter %d element of first array:\n",size);
	for(i=0; i<size; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	printf("enter %d element of secound array:\n",size);
	for(i=0; i<size;i++)
	{
		scanf("%d", &brr[i]);
	}
	
	sumArray(arr,brr,crr,size);
	
	printf("sum of arrays:\n");
	for(i=0; i<size; i++)
	{
		printf("%d ", crr[i]);
	}
	return 0;
	
}

void sumArray(int arr[], int brr[], int crr[], int size)
{
	int i;
	for(i=0; i<size; i++)
	{
		crr[i] = arr[i] + brr[i];
	}
}