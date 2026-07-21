void main()
{
	int no = 121;
	int rev;
	int r1, r2, r3;
	int q1;
	
   r1 = no%10;
   q1 = no/10;
   
   r2 = q1%10;
   r2 = q1%10;
   
   rev = r1*100 + r2*10 + r1;
   if(no == rev){
   	printf("pallindrome");
   	
   }else printf("not pallindrome");
	
}
