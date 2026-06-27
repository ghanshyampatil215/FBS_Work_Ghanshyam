#include<stdio.h>
//without paramter with retrun type
int strong ();

int main()
{
	int res;
	res = strong();
	if(res == 0)
	printf("strong number");
	else 
	printf("not strong number");
	return 0;
}

int strong()
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
	   return 0;
	else return 1;
}