#include<stdio.h>
#include<string.h>
int main()
{
	char str[100];
	int i ,count = 1;
	printf("enter string: ");
	scanf(" %[^\n]", str);
	
	for(i = 0; str[i] != '\0'; i++)
	{
		if(str[i] == ' ')
		{
			count ++;
	    }
	}
	
	printf("number of word = %d", count);
	return 0;
}