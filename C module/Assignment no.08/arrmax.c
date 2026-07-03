#include<stdio.h>
int main()
{
	int arr[10];
	int i,max;
	
	printf("enter your element");
	
	for( i=1; i < 10; i++)
	{
		scanf("%d", &arr[i]);
    }
    max = arr[1];
    
    for(i = 1; i < 10; i++)
   {
   	if(arr[i] > max)
   	{
   		max = arr[i];
	   }
   }
   	printf("maximum = %d", max);
   }
