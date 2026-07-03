#include<stdio.h>
int main()
{
	int arr[] = {23,43,45,65,43,56,78};
	int search;
	int flag = 0;
	int size = 7;
	printf("enter search element");
	scanf("%d", &search);
	 
	 for(int i=0; i<size; i++)
	 {
	   if(arr[i] == search)
	   {
	 	flag=1;
	 	printf("number found at index = %d ", i);
	 	break;
	 }
}
	 if(flag==1)
	{
	  printf("yes found");
	  }
	else 
	  {
	  	printf("not found");
	  }
	 
}