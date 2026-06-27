#include<stdio.h>
void table();
int main()
{
	table();
	
}
void table()
{
	int i, n;
	printf("enter your number");
	scanf("%d", &n);
	
	for(i=1; i<10; i++)
	{
		printf("%d \n",n * i);
	}
	
}