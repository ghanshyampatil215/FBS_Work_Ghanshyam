#include<stdio.h>
void sortArray(int arr[], int size);
int main()
{
	int arr[100], size,i;
    
    printf("enter array size: ");
    scanf("%d", &size);
    
    printf("Enter %d element:\n", size);
   
   for(i=0; i<size; i++)
   {
   	scanf("%d", &arr[i]);
   }
   sortArray(arr,size);
   
   printf("sorted array:\n");
   
   for(i=0; i<size; i++)
   {
   	printf("%d ", arr[i]);
   }
return 0;
}

void sortArray(int arr[], int size)
{
	int i, j, temp;
	
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
	
	
	
	
}
