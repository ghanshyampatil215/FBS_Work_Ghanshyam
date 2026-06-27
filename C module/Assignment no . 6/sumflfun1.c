//without parameter withput retrun type sum of first and last digit given number

#include<stdio.h>

void sum();

int main()
{
	sum();
	return 0;
}
void sum()
{
	int no, first , last;
	
	printf("enter a number");
	scanf("%d", &no);
	
	last = no%10;
	
	while(no >= 10)
	{
		no = no/10;
	}
	first = no;
	
	printf("sum = %d", first + last);
	
}