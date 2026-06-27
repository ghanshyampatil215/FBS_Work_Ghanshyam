//without parameter with retrun type sum of first and last digit given number

#include<stdio.h>

int sum();

int main()
{
	int res;
	
	
	res=sum();
	
	printf("sum = %d", res);
	return 0;
}
int sum()
{
	int no, first , last;
	printf("enter your number");
	
	scanf("%d", &no);
	
	last = no%10;
	
	while(no >= 10)
	{
		no = no/10;
	}
	 first = no;
	return first + last;

	
}