#include<stdio.h>
//without parameter without retrun type
void factorial();

int main()
{
	factorial();
	return 0;
}

void factorial()
{
	int no, i, fact = 1;
	
	printf("enter a number");
	scanf("%d", &no);
	
	for(i=1; i<= no; i++)
	{
		fact = fact * i;
	}
	printf("factorial = %d", fact);
}