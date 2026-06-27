#include<stdio.h>
//with parameter without return type
int factorial(int no);

int main()
{
	int no, res;
	printf("enter a number");
	scanf("%d", &no);
	res = factorial(no);
	
	printf("factorial = %d", res);
	return 0;
}

int factorial(int no)
{
	int  i, fact = 1;
	
	for(i=1; i<= no; i++)
	{
		fact = fact * i;
	}
     return fact;
}