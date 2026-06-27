#include<stdio.h>
//with parameter without return type
void perfect(int no);

int main()
{
	int no;
	printf("enter a number");
	scanf("%d", &no);
	perfect(no);
	return 0;
}

void perfect(int no)
{
	int i, sum = 0;
	
	
	
	for(i=1; i< no; i++)
	{
		if(no % i == 0)
		{
			sum = sum + i;
		}
	}
	if(sum == no)
	   printf("perfect number");
	else 
	printf("not perfect number");
}