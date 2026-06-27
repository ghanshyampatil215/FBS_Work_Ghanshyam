#include<stdio.h>
//with paramter with retrun type
int strong (int no);

int main()
{
	int no, res;
	printf("Enter a number");
	scanf("%d", &no);
	res = strong(no);
	if(res == 0)
	 printf("strong number");
	else 
	 printf("not strong number");
	strong(no);
	return 0;
}

int strong(int no)
{
	int temp,rem, sum = 0, i, fact;
	
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
	 else 
	 return 1;
}