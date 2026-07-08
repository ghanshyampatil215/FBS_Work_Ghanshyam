#include<stdio.h>
#include<string.h>
int main()
{
	char str [100];
	int i;
	
	printf("enter your string :");
	scanf(" %[^\n]", str);
	
	for(i =0; str[i] !='\0'; i++)
	{
		if(str[i] == ' ')
		{
			str[i] = '@';
		}
	}
	printf("New string : %s", str);
}