// Question 3: Library Fine Calculation
// Design a class named LibraryUser to calculate fines
// for late book returns.

class LibraryUser {

    // Fine charged per day is same for all users
    static double finePerDay = 5.0;

    // User-specific details
    String userName;
    int daysLate;

    // Constructor
    LibraryUser(String userName, int daysLate) {
        this.userName = userName;
        this.daysLate = daysLate;
    }

    // Method to calculate total fine
    // Total Fine = Days Late × Fine Per Day
    double calculateFine() {
        return daysLate * finePerDay;
    }

    // Method to display user details
    void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Days Late: " + daysLate);
        System.out.println("Fine Per Day: " + finePerDay);
        System.out.println("Total Fine: " + calculateFine());
        System.out.println();
    }
}


// Main class
public class LibraryDemo {

    public static void main(String[] args) {

        // Creating LibraryUser objects
        LibraryUser u1 = new LibraryUser("Ghnshyam", 5);
        LibraryUser u2 = new LibraryUser("Devendra", 10);

        // Display fine details
        u1.display();
        u2.display();
    }
}