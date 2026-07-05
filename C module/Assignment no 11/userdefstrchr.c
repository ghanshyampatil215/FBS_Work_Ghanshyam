#include<stdio.h>
#include<string.h>
int mystrchr (char str[], char ch);
int main()
{
	char str[] = "Ghanshyam";
	char ch = 'h';
	
	int index = mystrchr(str, ch);
	
	if(index == -1)
	  printf("character not found");
	else 
	printf("character found at index = %d", index);
	
	return 0;
	
}

int mystrchr(char str[], char ch)
{
	int i =0;
	
	while(str[i] != '\0')
	  {
	  	if(str[i] == ch)
		  {
		  	return i;
		  }
		  
	i++;
}
 return -1;
}

