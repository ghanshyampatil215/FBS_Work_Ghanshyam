#include<stdio.h>

typedef struct Student
{
	int rollno;
	float marks;
	char name[20];
}Student;

//function prototypes
void store(Student *);
void display(Student);

void main()
{
	Student s;
	
	store(&s);     //pass by Address
	display(s);    // pass by value
}

//store Data
void store(Student *ptr)
{
	printf("Enter Roll Number : ");
	scanf("%d", &ptr->rollno);
	
	printf("Enter Name : ");
	scanf("%s", ptr->name);
	
	printf("Enter Marks : ");
	scanf("%f", &ptr->marks);
}

//display data
void display(Student s)
{
	printf("\n-------Student Details-----\n");
	printf("Roll Number  :  %d\n", s.rollno);
	printf("Name         :   %s\n", s.name);
	printf("Marks        :  %.2f\n", s.marks);
}













	
