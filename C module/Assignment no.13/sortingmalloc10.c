//sort the array ascending order
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *arr;
	int size, i, j, temp;
	
	printf("enter array size: ");
	scanf("%d", &size);
	
   //Dynamic Memory Allocation
   arr = (int*)malloc(size * sizeof(int));
   
   if(arr == NULL)
   {
   	 printf("Memory Allocation failed...");
   	 return 0;
   }
   
   printf("Memory %d Element:\n",size);
   
	for(i=0; i < size; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	// sorting(Ascending Order)
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


printf("\ sorting Array ascending: \n");

 for(i=0; i < size; i++)
 {
 	printf("%d ", arr[i]);
 }
 free(arr);
 return 0;
}