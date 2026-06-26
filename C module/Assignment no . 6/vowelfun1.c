#include<stdio.h>
int check(char ch);
int  main()
{
	char ch;
	int res;
	printf("enter your cha");
	scanf(" %c", &ch);
	
	res = check(ch);
	if (res == 0)
	{
	printf("vowel ");	
} else 
printf ("not vowel ");
}

int check (char ch)
{
	
	if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' || ch== 'A' || ch== 'E' || ch== 'I' || ch== 'o'|| ch== 'u')
	{
		return 0;

	}
	else
	{
	  return 1;
   }

}