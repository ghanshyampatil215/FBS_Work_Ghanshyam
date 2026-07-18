//Q3.Implement a struc store detais Menu - drive add,updated, & display task. use function each opertion ?


#include<stdio.h>
#include<string.h>

#define MAX_TASKS 100

struct Task {
   int taskID;
    char description[100];
     char status[20];
};

struct Task tasks[MAX_TASKS];
   int count = 0;

 void addTask() {
    if (count >= MAX_TASKS){
       printf("\nTask list is full!\n");
     return ;
}

  printf("\nEnter Task ID;");
  scanf("%d", &tasks[count].taskID);

  getchar();

  printf("Enter Task Description:");
   fgets(tasks[count].description, sizeof(tasks[count].description),stdin);

  tasks[count].description[strcspn(tasks[count].description, "\n")] = '\0';

   strcpy(tasks[count].status, "pending");

   count++;

   printf("\nTask Added Successfully\n");
}


void updateTask(){
 int id, i, found = 0;
  
  printf("\nEnter task ID to update:");
  scanf("%d", &id);

  for(i=0; i<count; i++){
     if(tasks[i].taskID == id){
      printf("Enter new status (Pending/completed):");
      scanf("%s", tasks[i].status);

    printf("\nTasks updated succesfully\n");
    found = 1;
     break;
}
}

if (!found){
   printf("\nTask not found!\n");
}
}

void displayTasks(){
   int i;

 if(count == 0) {
   printf("\nNo tasks available!\n");
   return;
}

    printf("\n-----TO - DO LIST-----\n");

   for( i= 0; i<count; i++){
  printf("\nTask ID       :%d", tasks[i].taskID);
  printf("\nDescription   :%s", tasks[i].description);
  printf("\nstatus        :%s\n", tasks[i].status);
  printf("-------------------------\n");
}
}


int main(){
    int choice;

 do{
 
  printf("\n\n=====To do list menu=====");
  printf("\n1.Add Task");
  printf("\n2.update Task");
  printf("\n3.Display Task");
   printf("\n4.Exit");


  printf("\n\nEnter Your choice:");
  scanf("%d", &choice);

  switch (choice){
     case 1:
      addTask();
        break;

   case 2:
     updateTask();
      break;
 
  case 3:
     displayTasks();
      break;

 case 4:
    printf("\nExiting program...\n");
    break;

  default:
    printf("\nInvalid choice\n");
}
} while(choice != 4);
return 0;
}

