#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *arr, *brr, *crr;
	int i, j;
	int size1,size2;
	
    printf("enter size of first array");
    scanf("%d", &size1);
    
    printf("enter size of secound array");
    scanf("%d", &size2);
  
  // Dynamic Memory Allocation
  arr = (int*)malloc(size1 * sizeof(int));
  brr = (int*)malloc(size2 * sizeof(int));
  crr = (int*)malloc((size1 + size2) * sizeof(int));
  
  if(arr == NULL || brr == NULL || crr == NULL)
  {
  	printf("Memory Allocation Failed...");
  	return 0;
  }
   
   printf("\nEnter first Array Element:\n");	
	for(i = 0; i<size1; i++)
	{
		scanf("%d", &arr[i]);

	}
	printf("\nEnter Secound Array Element:\n");
	for(i = 0; i<size2; i++)
	{
		scanf("%d", &brr[i]);
	}

   // copy First Array
	for (i=0; i < size1; i++)
	{
		crr[i] = arr[i];
	}
	
	//copy secound array
     for(i = 0, j= size1; i < size2; i++,j++)
     {
     	crr[j] = brr[i];
	 }
	 
	 printf("\nMerged Array:\n");
	 for(i=0; i<size1 + size2; i++)
	 {
	 	printf("%d ", crr[i]);
	 }
	free(arr);
	free(brr);
	free(crr);
	
	return 0;
	
}