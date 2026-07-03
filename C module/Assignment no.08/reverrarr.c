#include<stdio.h>
int main()
{
	int arr[100];
	int size,i;
	
	printf("enter your arr size");
	scanf("%d", &size);
	
	printf("enter %d element\n", size);

	
	for(i=0; i<size; i++)
	 {
	 	scanf("%d", &arr[i]);
	 }
	 
	 printf("array in reverse order\n");
	 
	 for(i = size-1; i >= 0; i--)
	 {
	 	printf("%d ", arr[i]);
	 }
}
