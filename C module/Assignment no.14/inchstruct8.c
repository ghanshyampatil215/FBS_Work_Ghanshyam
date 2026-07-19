#include<stdio.h>

typedef struct Distance
{
	int feet;
	int inch;
}Distance;

void store(Distance *);
void display(Distance);

void main()
{
	Distance d;
	
	store(&d);
	display(d);
}
void store(Distance *ptr)
{
	printf("Enter feet : ");
	scanf("%d", &ptr->feet);
	
	printf("Enter inch : ");
	scanf("%d", &ptr->inch);
}

void display(Distance d)
{
	printf("\n---Distance-----\n");
	printf("feet : %d\n", d.feet);
	printf("inch : %d\n", d.inch);
}