#include<stdio.h>

void check(int *n);
int main()
{
	int num;
	
	printf("enter number :");
	scanf("%d", &num);
	
	check(&num);
	
	
}

void check(int *n)
{
	if(*n > 0)
	  printf("positive");
	else if(*n < 0)
	 printf("negative");
	 else 
	 printf("zero");
}