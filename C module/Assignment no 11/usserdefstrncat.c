#include<stdio.h>

void mystrncat(char str1[], char str2[], int n);

int main()
{
	char str1[20] = "ghanshyam";
	char str2[] = "patil";
	int n =3;
	
	mystrncat(str1, str2,n);
	printf("%s", str1);
	return 0;
}
void mystrncat(char str1[], char str2[], int n)
{
	int i =0, j = 0;
	
	while(str1[i] != '\0')
	{
		i++;
	}
	
	while(j < n && str2[j] != '\0')
	{
		str1[i] = str2[j];
		i++;
		j++;
	}
    str1[i] = '\0';
}
