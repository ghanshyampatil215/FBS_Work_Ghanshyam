#include<stdio.h>
int main ()
{
	int arr[] = { 42, 45 ,667, 65, 23,67};
	int i ;
	
	for(i=0; i<6; i++)
	 { 
	    if(arr[i] % 2 == 0)
	    {
	    	printf("%d is even number\n",arr[i]);
		}
		else 
		{
			printf("%d is odd number\n",arr[i]);
		}
    } 
}

