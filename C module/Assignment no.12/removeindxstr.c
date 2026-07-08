//WAP to Remove the nth Index Character from a Non-Empty String
#include<stdio.h>
#include<string.h>
int main()
{
	char str[100];
	int index,i;

    printf("enter a string: ");
    scanf("%s", str);
  
    printf("enter index to remove: ");
    scanf("%d", &index);
  
  for(i = index; str[i]!='\0'; i++)
  
  {
  	str[i] = str[i + 1];
  }
  printf("string after removing charracter = %s", str);
  
  return 0;
}
