class Hr{
           int id;
           String name;
           int salary;
}
 //class Date ends here
  class TestHr{
           public static void main(String[] args){

            Hr h1; //refernce
            h1 = new Hr();
            System.out.println(h1);         
           
           Hr h2;
           h2 = new Hr();
           System.out.println(h2);
     }
}