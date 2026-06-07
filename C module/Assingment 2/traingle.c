//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.

void  main()
{
	int side1 = 10;
	int side2 = 12;
	int side3 = 17;
	
	if((side1 == side2) && (side1 == side3)){
		printf("equilateral");
	}
	if((side1 == side2) || (side1 == side3)||(side2 == side3)){
		printf("isosceles");
	}
	 else printf("scalene");
}