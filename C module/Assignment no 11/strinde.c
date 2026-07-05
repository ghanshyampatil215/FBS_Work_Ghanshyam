#include<stdio.h>
#include<string.h>

char* mystrchar(char str[], char ch);

int main()
{
    char str[] = "firstbit";
    char *x;

    x = mystrchar(str, 'i');

    if(x != NULL)
        printf("Character found at index %d", x - str);
    else
        printf("Character not found");

    return 0;
}

char* mystrchar(char str[], char ch)
{
    int i;

    for(i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ch)
        {
            return &str[i];
        }
    }

    return NULL;
}