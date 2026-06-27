#include<stdio.h>
//with parameter without return type
void factorial(int no);

int main()
{
	int no;
	printf("enter a number");
	scanf("%d", &no);
	
	factorial(no);
	return 0;
}

void factorial(int no)
{
	int  i, fact = 1;
	
	for(i=1; i<= no; i++)
	{
		fact = fact * i;
	}
     printf("factorial = %d", fact);
}