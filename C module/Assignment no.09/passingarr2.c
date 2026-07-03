#include<stdio.h>
int main()
{
   int arr[100], size,i,key;
   
	printf("enter search element");
	scanf("%d", &size);
	 
	 
	 printf("enter %d element:\n",size);
	 for(int i=0; i<size; i++)
	
	   {
         scanf("%d", &arr[i]);
    }
    
    printf("enter number to search: ");
    scanf("%d", &key);
    
    search(arr,size,key);
    return 0;
}

void search(int arr[], int size, int key)
{

	int i, found = 0;
	
	for(i=0; i<size; i++)
	{
		if(arr[i] == key)
		{
			printf("%d found at index %d\n", key,i);
			found = 1;
			break;
		}
	}
	if(found == 0)
	{
		printf("%d not found in the array.\n", key);
	}
}