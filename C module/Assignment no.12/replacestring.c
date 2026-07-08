//WAP Replace all Occurrences of ‘a’ with $ in a String
#include<stdio.h>
#include<string.h>

int main()
{
	char str[100];
	int i;
	printf("enter your name:");
	scanf("%s", &str);
	
	for(int i =0; str[i] != '\0'; i++)
	{
		if(str[i] == 'm' )
		{
			str[i] = '$';
		}
		
	}
	printf("modified string = %s", str);
	return 0;
	
}