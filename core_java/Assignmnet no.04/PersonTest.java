class Person {

    String name;
    int age;

    Person() {
        this.name = "Not Given";
        this.age = 0;

        System.out.println("Default Constructor of Person");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor of Person");
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}


class Teacher extends Person {

    String subject;
    int experience;

    Teacher() {
        super();

        this.subject = "Not Given";
        this.experience = 0;

        System.out.println("Default Constructor of Teacher");
    }

    Teacher(String name, int age, String subject, int experience) {
        super(name, age);

        this.subject = subject;
        this.experience = experience;

        System.out.println("Parameterized Constructor of Teacher");
    }

    String getSubject() {
        return subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    int getExperience() {
        return experience;
    }

    void setExperience(int experience) {
        this.experience = experience;
    }

    void display() {
        super.display();

        System.out.println("Subject: " + this.subject);
        System.out.println("Experience: " + this.experience + " Years");
    }
}


class Student extends Person {

    String course;
    double percentage;

    Student() {
        super();

        this.course = "Not Given";
        this.percentage = 0;

        System.out.println("Default Constructor of Student");
    }

    Student(String name, int age, String course, double percentage) {
        super(name, age);

        this.course = course;
        this.percentage = percentage;

        System.out.println("Parameterized Constructor of Student");
    }

    String getCourse() {
        return course;
    }

    void setCourse(String course) {
        this.course = course;
    }

    double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    void display() {
        super.display();

        System.out.println("Course: " + this.course);
        System.out.println("Percentage: " + this.percentage);
    }
}


public class PersonTest {

    public static void main(String[] args) {

        Teacher t1 = new Teacher( "Devendra",35,"Java", 8 );

        Student s1 = new Student( "Ghanshyam",21,"AIML",82.5 );

        System.out.println();

        System.out.println("Teacher Details:");
        t1.display();

        System.out.println();

        System.out.println("Student Details:");
        s1.display();
    }
}