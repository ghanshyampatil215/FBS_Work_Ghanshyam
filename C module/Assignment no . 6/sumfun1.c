int main()
{
	sum();
	return 0;
}

void sum()
{
	int start, end, i, sum =0;
	
	printf("enter start:");
	scanf("%d", &start);
	
	printf("enter end:");
	scanf("%d", &end);
	
	for(i = start; i <= end; i++)
	{
		sum = sum + i;
	}
	printf("sum = %d", sum);
}