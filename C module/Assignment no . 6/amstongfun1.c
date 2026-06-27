#include<stdio.h>

int amstrong(int no);

int main()
{
	int no, res;
	
	printf("enter your number");
	scanf("%d", &no);
	
	res = amstrong(no);
	if(res == 0)
	  printf("amstrong Number");
	else 
	  printf("not amstrong number");

	return 0;
	
}
int amstrong(int no)
{
	int temp, rem,sum = 0;
	
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
