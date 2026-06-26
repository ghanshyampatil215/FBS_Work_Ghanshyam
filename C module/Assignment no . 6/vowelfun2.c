#include<stdio.h>
void check(char ch);
int  main()
{
	char ch ;
	printf("enter your cha");
	scanf(" %c", &ch);
	
	check( ch);
  
}

void check (char ch)
{
	
	if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' ||
	    ch=='A' || ch=='E'  || ch=='I' || ch=='O' || ch=='u')
	{
		printf("vowel ");	
} 
else
 {
printf ("not vowel ");
}

}

