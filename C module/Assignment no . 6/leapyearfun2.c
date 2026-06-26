#include<stdio.h>
int leap();
int main()
{
	int year = leap();
	if(year == 0)
	{
		printf("leap year");
		
	}else printf(" not leap year");
}


int leap(){
	int year ;
	printf("Enter your number");
	scanf("%d", &year);
	if((year % 400 == 0) || (year%4 == 0 && year % 100 != 0 ))
	{
		return 0;
	}else  return 1;
	
}
