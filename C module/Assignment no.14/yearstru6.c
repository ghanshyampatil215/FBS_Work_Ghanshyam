#include<stdio.h>

typedef struct Date
{
	int day;
	int month;
	int year;
}Date;

//function prototype
void store(Date *);
void display(date);

void main()
{
	Date d;
	
	store(&d);
	display (d);
}

void store(Date *ptr)
{
	printf("Enter date : ");
	scanf("%d", &ptr->day);
	
	printf("Enter Month : ");
	scanf("%d", &ptr->month);
	
	printf("Enter year : ");
	scanf("%d",&ptr->year);
}
void display(Date d)
{
	printf("\n-----details Year----\n");
	printf("day    : %d\n",d.day);
	printf("month  : %d\n", d.month);
	printf("Month  : %d\n", d.year);
}