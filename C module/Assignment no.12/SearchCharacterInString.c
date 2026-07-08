#include<stdio.h>
#include<string.h>

int main()
{
	char str[100];
	char ch;
	int i, flag = 0;
	
 printf("enter string :");
 scanf("%s", str);
 
 printf("enter character to search : ");
 scanf(" %c", &ch);
 
 for(i=0; str[i] != '\0'; i++)
 {
 	if(str[i] == ch)
 	 {
 	 	flag = 1;
 	     break;
	  
	  }
 }
 
  if(flag == 1)
   printf("character found");
else 
   printf("character not found");
 
return 0;
}