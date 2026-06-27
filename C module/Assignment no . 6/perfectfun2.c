#include<stdio.h>
//without parameter with return type
int perfect();

int main()
{
	int res;
	res = perfect();
	if(res == 0)
	  printf("perfect number");
	else 
	printf("not perfect number");
	return 0;
}

int perfect()
{
	int no, i, sum = 0;
	
	printf("enter a number");
	scanf("%d", &no);
	
	for(i=1; i< no; i++)
	{
		if(no % i == 0)
		{
			sum = sum + i;
		}
	}
	if(sum == no)
	 return 0;
	else 
	  return 1;
}