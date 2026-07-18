
#include<stdio.h>
#include<string.h>
 int main()
 {
   char str[100];
    char ch, symbol;
     int i;

   printf("Enter a string: ");
     gets(str);

    printf("Enter Character to repalce:" );
    scanf(" %c", &ch);

   printf("Enter a speical symbol:");
   scanf(" %c", &symbol);

    for(i=0;str[i]!='\0'; i++)
    {
        if(str[i]==ch) 
    	{
       str[i] = symbol;
    }
} 
   printf("\nUpadted string %s\n", str);

   return 0;
}