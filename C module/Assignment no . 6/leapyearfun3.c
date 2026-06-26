#include<stdio.h>

int leap(int year);

int main()
{
	int year, res;
	printf("Enter your year");
	scanf("%d", &year);

	res = leap(year);
	
	if(res == 0)
	{
		printf("leap year");
	}
	else 
	{
		printf("not leap year");
	}
	return 0;
}
	
	int leap (int year)
	{
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		
			return 0;
		
		else 
			return 1;
		
	}
	

