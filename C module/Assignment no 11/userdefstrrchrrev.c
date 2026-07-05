#include<stdio.h>
#include<string.h>

int mystrrchr(char str[], char ch);

int main()
{
	char str[] = "Ghanshyam";
	char ch = 'a';
	
	int index = mystrrchr(str,ch);
	
	if(index == -1)
	   printf("character not found");
	else 
	  printf("character found at index = %d", index);
	  
	  return 0;
}
int mystrrchr(char str[], char ch)
{
	int i =0;
	int pos = -1;
	
	while(str[i] != '\0')
	{
		if(str[i] == ch)
		{
			pos = i;
		}
		i++;
	}
	return pos;
}