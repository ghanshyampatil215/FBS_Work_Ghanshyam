#include<stdio.h>

void mergeArray(int arr[], int brr[], int crr[], int size1,int size2);

int main()
{
	int arr[100], brr[100], crr[200];
	int size1, size2, i;
	
	printf("enter size of first array: ");
	scanf("%d", &size1);
	
	printf("enter %d element:\n", size1);
	for(i=0; i<size1; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	printf("enter size of secound array:");
	scanf("%d", &size2);
	
	printf("enter %d element:\n", size2);
	for(i=0; i<size2; i++)
	{
		scanf("%d",&brr[i]);
	}
	
	mergeArray(arr,brr,crr,size1,size2);
	
	printf("merged array:\n");
	for(i=0; i<size1 + size2; i++)
	{
		printf("%d ", crr[i]);
	}
	return 0;
}

void mergeArray(int arr[],int brr[],int crr[],int size1, int size2)
{
	int i,j=0;
	for(i=0; i<size1; i++)
	{
		crr[j]= arr[i];
		j++;
	}
	for(i=0; i<size2; i++)
	{
		crr[j] = brr[i];
		j++;
	}
}