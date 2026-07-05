#include<stdio.h>

void mystrupper(char str[]);
int main()
{
	char str[] = "GHanshyam";
	mystrupper(str);
	printf("%s", str);
	return 0;
}

void mystrupper(char str[])
{
	int i = 0;
	
	while(str[i] != '\0')
	   {
	   	 if(str[i] >= 'a' && str[i] <= 'z')
	   	 {
	   	 	str[i] = str[i] - 32;
			}
			i++;
	   }
}