#include<stdio.h>
 
 typedef struct time
 {
 	int hour;
 	int min;
 	int sec;
 }time;
 
 //function protype
 void store(time *);
 void display(time);
 
 void main()
 {
 	time t;
 	
 	store(&t);
 	display(t);
 }
 
 void store(time *ptr)
 {
 	printf("Enter hour : ");
 	scanf("%d", &ptr->hour);
 	
 	printf("Enter min : ");
 	scanf("%d", &ptr->min);
 	
 	printf("Enter sec : ");
 	scanf("%d", &ptr->sec);
 }
 void display(time t)
 {
 	printf("\n-----Time Details----\n");
 	printf("hr  : %d\n", t.hour);
 	printf("min  :%d\n", t.min);
 	printf("sec  : %d\n", t.sec);
 	
 }
 