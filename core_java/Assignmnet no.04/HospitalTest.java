class Hospital {

    String hospitalName;
    String location;

    Hospital() {
        this.hospitalName = "Not Given";
        this.location = "Not Given";

        System.out.println("Default Constructor of Hospital");
    }

    Hospital(String hospitalName, String location) {
        this.hospitalName = hospitalName;
        this.location = location;

        System.out.println("Parameterized Constructor of Hospital");
    }

    String getHospitalName() {
        return hospitalName;
    }

    void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void display() {
        System.out.println("Hospital Name: " + this.hospitalName);
        System.out.println("Location: " + this.location);
    }
}


class Doctor extends Hospital {

    String specialization;
    int experience;

    Doctor() {
        super();

        this.specialization = "Not Given";
        this.experience = 0;

        System.out.println("Default Constructor of Doctor");
    }

    Doctor(String hospitalName, String location,
           String specialization, int experience) {

        super(hospitalName, location);

        this.specialization = specialization;
        this.experience = experience;

        System.out.println("Parameterized Constructor of Doctor");
    }

    String getSpecialization() {
        return specialization;
    }

    void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    int getExperience() {
        return experience;
    }

    void setExperience(int experience) {
        this.experience = experience;
    }

    void display() {
        super.display();

        System.out.println("Specialization: " + this.specialization);
        System.out.println("Experience: " + this.experience + " Years");
    }
}


class Nurse extends Hospital {

    String department;
    String shift;

    Nurse() {
        super();

        this.department = "Not Given";
        this.shift = "Not Given";

        System.out.println("Default Constructor of Nurse");
    }

    Nurse(String hospitalName, String location,
          String department, String shift) {

        super(hospitalName, location);

        this.department = department;
        this.shift = shift;

        System.out.println("Parameterized Constructor of Nurse");
    }

    String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    String getShift() {
        return shift;
    }

    void setShift(String shift) {
        this.shift = shift;
    }

    void display() {
        super.display();

        System.out.println("Department: " + this.department);
        System.out.println("Shift: " + this.shift);
    }
}


public class HospitalTest {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("City Hospital","Jalgaon", "Cardiologist",8 );

        Nurse n1 = new Nurse( "City Hospital","Jalgaon","Emergency","Night");

        System.out.println();

        System.out.println("Doctor Details:");
        d1.display();

        System.out.println();

        System.out.println("Nurse Details:");
        n1.display();
    }
}