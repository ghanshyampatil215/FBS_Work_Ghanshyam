#include<stdio.h>

void prime(int no);

int main()
{

	int no;
	
		printf("enter a number");
		scanf("%d", &no);
		
		prime(no);
}

void prime(int no)
{
	int i, count = 0;
	
	
	for(i = 1; i<= no; i++)
	{
		if(no % i ==0)
		{
			count++;
		}
	}
	if(count == 2)

	      {
	      	printf("prime number");
		  }
	else 
	{
		printf("not prime number");
	}
}
		
