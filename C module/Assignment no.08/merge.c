#include<stdio.h>
int main()
{
	int arr[100], brr[100], crr[200];
	int i;
	int size1,size2;
	
    printf("enter size of first array");
    scanf("%d", &size1);
    
    printf("enter %d element \n", size1);
    for(i=0; i < size1; i++)
    {
    	scanf("%d", &arr[i]);
	}
    printf("enter size of secound array");
    scanf("%d", &size2);
    
	printf("enter your %d element:", size2);
	for(i =0 ; i<size2; i++)
	{
		scanf("%d", &brr[i]);
	}
	
	
	for(i = 0; i<size1; i++)
	{
		crr[i] = arr[i];

	}
	
	for(i = 0; i<size2; i++)
	{
		crr[size1 + i] = brr[i];
	
	}
	for (i=0; i<size1 + size2; i++)
	{
		printf("%d ", crr[i]);
	}
	
}