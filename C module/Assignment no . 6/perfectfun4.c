#include<stdio.h>
//with paramter with return type
int perfect(int no);

int main()
{
	int no;
	int res;
	printf("enter your number");
	scanf("%d", &no);
    
	res = perfect(no);
	if(res == 0) 
	printf("perfect number");
	else 
	printf("not perfect number");
	
	perfect(no);
	return 0;
}

int perfect(int no)
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
	 return 0;
	 else 
	 return 1;
}