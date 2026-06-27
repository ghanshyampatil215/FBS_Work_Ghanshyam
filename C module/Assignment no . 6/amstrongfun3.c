#include<stdio.h>
//with parameter without  retrun type
int amstrong(int no);

int main()
{
	int no;
	printf("enter a number");
	scanf("%d", &no);
	
	amstrong(no);
	
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
	  printf("amstrong Number");
	else 
	  printf("not amstrong number");
	 
}
