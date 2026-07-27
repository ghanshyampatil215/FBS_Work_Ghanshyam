class Employee{
           int id;
           String name;
           int salary;
}
 //class Date ends here
  class TestEmployee{
           public static void main(String[] args){

            Employee e1; //refernce
            e1 = new Employee();
            System.out.println(e1);         
           
           Employee e2;
           e2 = new Employee();
           System.out.println(e2);
     }
}