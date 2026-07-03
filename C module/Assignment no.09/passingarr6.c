#include<stdio.h>

void primeArray(int arr[], int size);

int main()
{
	int arr[100],size,i;
	
	printf("enter array size: ");
	scanf("%d",&size);
	
	printf("enter %d element:\n", size);
	
	for(i=0; i<size;i++)
	{
		scanf("%d", &arr[i]);
	}
	primeArray(arr,size);
	
	return 0;
}

void primeArray(int arr[],int size)
{
	int i,j,flag;
	printf("prime number are:\n");
	
	for(i=0; i<size; i++)
	{
		if(arr[i] <= 1)
		continue;
		
		flag = 1;
		
		for(j=2; j<arr[i]; j++)
		{
			if(arr[i]%j == 0)
			{
				flag =0;
				break;
			}
		}
		if(flag == 1)
		{
			printf("%d ", arr[i]);
		}
	}
}