#include<stdio.h>
int main()
{
	int arr[100];
	int size,i;
	 int sum = 0;
	printf("enter your arr element");
	scanf("%d",&size);
  
   printf("enter %d element:\n", size);
   
   for(i = 0; i<size; i++)
   {
   	scanf("%d", &arr[i]);
	} 
	for(i=0; i<size; i++)
	{
		sum = sum+ arr[i];
	}
	printf("sum = %d", sum);
	
}