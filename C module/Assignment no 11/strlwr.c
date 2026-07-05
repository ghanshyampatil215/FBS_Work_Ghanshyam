#include<stdio.h>
#include<string.h>

void mystrlower(char str[]);

int main()
{
	char str[] ="GHANSHYAM";
	
	mystrlower(str);
	
	printf("%s", str);
	return 0;
}

void mystrlower(char str[])
{
	int i  = 0;
	
	while(str[i] != '\0')
	{
		if(str[i] >= 'A' && str[i] <= 'Z')
		{
			str[i] = str[i] + 32;
		}
		i++;
	}
}