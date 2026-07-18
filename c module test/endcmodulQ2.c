#include<stdio.h>

int main()
{
   int start, end,i,j;
   int sum = 0;
   int isPrime;

    printf("Enter statring number");
     scanf("%d", &start);

    printf("Enter ending number");
    scanf("%d", &end);

      for( i = start; i<=end; i++)
   {    isPrime = 1;

       if(i<2){
        isPrime = 0;
      } else {
       for( j = 2; j<=i/2; j++){
         if(i % j == 0){
           isPrime = 0;
          break;
      }
     }
     }
   if (isPrime) {
    sum = sum + i;
   }
 }
  
  printf("sum Of prime Numbers = %d", sum);
  return 0;
}
