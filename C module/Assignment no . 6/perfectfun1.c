#include<stdio.h>

void perfect();

int main()
{
	perfect();
	return 0;
}

void perfect()
{
	int no, i, sum = 0;
	
	printf("enter a number");
	scanf("%d", &no);
	
	for(i=1; i< no; i++)
	{
		if(no % i == 0)
		{
			sum = sum + i;
		}
	}
	if(sum == no)
	   printf("perfect number");
	else 
	printf("not perfect number");
}