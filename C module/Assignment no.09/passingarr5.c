#include<stdio.h>

void alternate(int arr[],int size);
int main()
{
	int arr[100], i,size;
	
	printf("enter your arr size: ");
	scanf("%d", &size);

    printf("Enter %d element:\n",size);
    
    for(i=0; i<size; i++)
    {
    	scanf("%d", &arr[i]);
	}
	
	alternate(arr,size);
	
	return 0;
}

void alternate(int arr[],int size)
{
	int i;
	
	printf("alternate element are:");
	
	for(i=0; i<size; i=i+2)
	{
		printf("%d ", arr[i]);
	}
}
