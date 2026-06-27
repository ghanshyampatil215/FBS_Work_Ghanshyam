#include<stdio.h>

int prime();

int main()
{
	int res;
	
	res = prime();
	
	if(res==0)
	{
		printf("prime number");
	}
	else 
	{
		printf("not prime number");
	}
}

int prime()
{
	int no, i, count = 0;
	
	printf("enter a number");
	scanf("%d", &no);
	
	for(i = 1; i<= no; i++)
	{
		if(no % i ==0)
		{
			count++;
		}
	}
	if(count == 2)

	      return 0;
	
	else 
	
		return 1;
	
}