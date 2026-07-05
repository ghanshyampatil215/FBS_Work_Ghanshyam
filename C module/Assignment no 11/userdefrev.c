#include<stdio.h>
#include<string.h>

int main()
{
	char str[] = "patil";
	mystrrev(str);
	
	printf("%s", str);
	
	return 0;
}

void mystrrev(char str[])
{
	int i = 0, len = 0;
	char temp;
	
	while(str[len] != '\0')
	{
		len++;
	}
	len--;
	
	while(i< len)
	{
		temp = str[i];
		str[i] = str[len];
		str[len] = temp;
		
		i++;
		len--;
	}
}