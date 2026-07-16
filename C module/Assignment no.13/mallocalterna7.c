//Take Two Arrays and Store Their Sum in Third Array (Using malloc())

#include<stdio.h>
#include<stdlib.h>

int main()
{
	int *arr, *brr, *crr;
	int size, i;
	
	printf("Enter array size : ");
	scanf("%d", &size);
	
	//Dynamic Memory Allocation
	arr = (int*)malloc(size * sizeof(int));
	brr = (int*)malloc(size * sizeof(int));
	crr = (int*)malloc(size * sizeof(int));
	
	if(arr == NULL || brr == NULL || crr == NULL)
	{
		printf("Memory Allocation failed...");
		return 0;
	 } 
	 
	 printf("\nEnter First Array Element:\n");
	 for(i=0; i<size; i++)
	 {
	 	scanf("%d", &arr[i]);
	 }
	 
	 printf("\nEnter secound array Element:\n");
	 for(i =0 ; i<size ; i++)
	 {
	 	scanf ("%d", &brr[i]);
	 }
	 
	 // store sum in third Array
	 for(i = 0; i<size; i++)
	 {
	 	crr[i]= arr[i] + brr[i];
	 }
	 //store sum in third Array
	 for(i=0; i<size ; i++)
	 {
	 	printf("%d ", crr[i]);
	 }
	 
	 free(arr);
	 free(brr);
	 free(crr);
	 
	 return 0;
}