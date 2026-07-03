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
	sum = sumArray(arr, size);
	
	printf("sum of all element = %d" , sum);
	
	return 0;
}
	
	 int sumArray(int arr[], int size)
{
	int i, sum = 0;
	for(i=0; i<size; i++)
	{
		sum = sum + arr[i];
	}
	return sum;
}