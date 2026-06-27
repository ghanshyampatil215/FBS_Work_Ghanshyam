//with parameter with retrun type sum of first and last digit given number

#include<stdio.h>

int sum(int no);

int main()
{
	int no, res;
	
	printf("enter your number");
	scanf("%d", &no);
	
	res = sum(no);
	printf("sum = %d", res);
	
    sum(no);

	return 0;
}
int sum(int no)
{
	int first , last;
	
	last = no%10;
	
	while(no >= 10)
	{
		no = no/10;
	}
	 first = no;
		return (first + last);

}