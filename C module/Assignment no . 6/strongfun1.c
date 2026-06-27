#include<stdio.h>
//without paramter without retrun type
void strong ();

int main()
{
	strong();
	return 0;
}

void strong()
{
	int no, temp,rem, sum = 0, i, fact;
	
	printf("Enter a number");
	scanf("%d", &no);
	
	temp = no;
	
	while(temp != 0)
	{
		rem = temp % 10;
		fact = 1;
		
		for(i = 1; i<= rem; i++)
		{
			fact = fact * i;
		}
		sum = sum + fact;
		temp = temp/10;
	}
	if(sum ==no)
	  printf("strong number");
	else 
	 printf("not strong number");
}