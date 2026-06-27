#include<stdio.h>

void prime();

int main()
{
	prime();
	
}
void prime()
{
	int no, i, count = 0;
	
	printf("Enter a number");
	scanf("%d", &no);
	
	for(i=1; i <= no; i++)
	{
		if(no % i == 0)
		{
			count++;
		}
	}
	if (count == 2)
	{
		printf("prime number");
	}
	else  
	{
		printf("not prime number");
	}
}