#include<stdio.h>
void table(int n);
int main()
{
	int  n;
	printf("enter your number");
	scanf("%d", &n);
	
	table(n);
	
}
void table(int n)
{

	for(int i=1; i<10; i++)
	{
		printf("%d \n",n * i);
	}
	
}