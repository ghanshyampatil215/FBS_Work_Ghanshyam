#include<stdio.h>
void table(int *n);
int main()
{
	int  n;
	printf("enter your number");
	scanf("%d", &n);
	
	table(&n);
	
}
void table(int *n)
{

	for(int i=1; i<11; i++)
	{
		printf("%d * %d = %d\n",*n,i,(*n)*i);
	}
	
}