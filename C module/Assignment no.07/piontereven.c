#include<stdio.h>
   void evenoOdd(int *n);
	int main()
	{
	
		int num;
		
		printf("enter your number");
		scanf("%d", &num);
		
		evenoOdd(&num);
		
		return 0;
		
	}
	void evenoOdd(int *n)
	{
	  if(*n % 2 == 0)
		  printf("even number");
		else
		    printf("odd number"); 
	}
