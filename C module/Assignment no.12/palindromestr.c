#include<stdio.h>
#include<string.h>
int main()
{
	char str[100];
	int i,j, len = 0, flag =1;
	
	printf("enter string :");
	scanf("%s", str);
	
	while(str[len] != '\0')
	{
		len ++;
	}
	j= len -1;
	
	for(i = 0; i< j ; i++, j--)
	{
		if(str[i] != str[j])
		{
			flag = 0;
			break;
		}
	}
	if(flag == 1)
	  printf("palindrome string");
	else 
	 printf(" not a palindrome string");
	 return 0;
}