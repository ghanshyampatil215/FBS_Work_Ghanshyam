#include<string.h>
#include<stdio.h>
int main()
{
	char str[100];
	int i, j=0;
	
	printf("enter string: ");
	scanf(" %[^\n]", str);
	
	for(i=0; str[i] != '\0'; i=i+2)
	{
		str[j] = str[i];
	    j++;
	}
	
	str[j] = '\0';
	
 printf("new string = %s", str);
}

