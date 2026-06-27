#include<stdio.h>

int amstrong();

int main()
{
	int res;
	
	res = amstrong();
	if(res == 0)
	  printf("amstrong Number");
	else 
	  printf("not amstrong number");

	return 0;
	
}
int amstrong()
{
	int no, temp, rem,sum = 0;
	
	printf("enter a number");
	scanf("%d", &no);
	
	temp = no;
	
	while(temp != 0)
	{
		rem  = temp %10;
		sum = sum + rem * rem * rem;
		temp = temp/10;
	}
	if(sum == no)
	  return 0;
	else 
	
	   return 1;
}
