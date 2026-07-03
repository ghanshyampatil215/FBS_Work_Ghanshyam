#include<stdio.h>
int main()
{
	int arr[100];
	int i,j,flag;
	int size;
	
	
	printf("enter your element");
	scanf("%d", &size);
	
      printf("enter %d elements:\n", size);
	
	for(i=0; i <size; i++)
	{
		scanf("%d", &arr[i]);
	}
	printf("prime number are:\n");
	

		for(i = 0; i < size; i++)
		{
			flag = 1;
			if(arr[i] <= 1)
			{
				flag = 0;
			
			}
			
			for(j = 2; j<= arr[i]/2; j++)
		{
			if(arr[i]%j==0)
			{
				flag = 0;
				break;
			}
		}
	
	 if(flag ==1)
	   {
	    printf("%d ", arr[i]);
  }
}
}