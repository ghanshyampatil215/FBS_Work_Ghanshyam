#include<stdio.h>
int main()
{
	int arr[100];
	int size;
	int i;
	
	printf("enter your element");
	scanf("%d", &size);
	
	
	for(i = 0; i<size; i++)
		{
		  scanf("%d", &arr[i]);
			
		}
	
	for(i = 0; i<size; i=i+2)
	
	{
		printf("%d ", arr[i]);
	}
}