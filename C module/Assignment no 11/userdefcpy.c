#include<stdio.h>
#include<string.h>

void mystrncpy(char str1[], char str2[],int n);
int main()
{
	char str1[20];
	char str2[] = "Ghanshyam";
	int n = 7;
	
	mystrncpy(str1, str2,n);
	
	printf("str1 = %s", str1);
	
	return 0;
}

void mystrncpy(char str1[], char str2[], int n)
{
	int i = 0;
	
	while(i < n && str2[i] != '\0')
	{
		str1[i] = str2[i];
		i++;
	}
	
	str1[i] ='\0';
}