#include<stdio.h>

int main()
{
	int num;
	
	printf("enter your number");
	scanf("%d", &num);
	
	if(num > 0)
	{
		printf("positive number");
	}
	else if(num < 0)
	{
		printf("Negative number");
	}
	 else 
	 {
	 	printf("neutral (zero)");
	 }
		
}