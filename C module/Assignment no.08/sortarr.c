#include<stdio.h>

int main()
{
	int arr[100];
	int size, i, j, temp;
	
	printf("enter array size: ");
	scanf("%d", &size);
	
	printf("enter %d element:\n", size);
	
	for(i=0; i < size; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	for(i=0; i<size-1; i++)
	{
		for(j=i + 1; j<size; j++)
		{
			if(arr[i] > arr[j])
			{
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		}
	}


printf("array after sorting ascending: \n");

 for(i=0; i < size; i++)
 {
 	printf("%d ", arr[i]);
 }
}