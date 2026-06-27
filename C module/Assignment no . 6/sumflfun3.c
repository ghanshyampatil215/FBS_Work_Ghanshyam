//with parameter without  retrun type sum of first and last digit given number

#include<stdio.h>

void sum(int no);

int main()
{
	int no;
	printf("enter your number");
	scanf("%d", &no);
	
    sum(no);

	return 0;
}
void sum(int no)
{
	int first , last;
	
	last = no%10;
	
	while(no >= 10)
	{
		no = no/10;
	}
	 first = no;
		printf("sum = %d", first + last);

	
}