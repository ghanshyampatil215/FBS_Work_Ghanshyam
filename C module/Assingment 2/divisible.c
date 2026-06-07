//Accept a number and check if it is divisible by 3, 5, or both.

void main(){
	
	int num = 74;
	
	if ((num %3== 0) && (num % 5== 0)) 
	{
		printf("both divisible");
    }else if (num % 3 ==0){
    	printf(" 3 divisible");
	}else if(num % 5 == 0){
		printf("5 divisible");
	}else printf("not divisible by 3 & 5");
}