#include<stdio.h>

void sum(int start, int end);

int main()
{
	int start, end;
	
	printf("enter start:");
	scanf("%d", &start);
	
	printf("enter end:");
	scanf("%d", &end);
	
	sum(start, end);
	return 0;
}

void sum(int start, int end)
{
  int i, sum = 0;
	
	for(i = start; i <= end; i++)
	{
		sum = sum + i;
	}
	printf("sum = %d", sum);
}