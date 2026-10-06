package p1;
class EmptyNameException extends Exception {
    EmptyNameException(String message) {
        super(message);
    }
}

class UnderageException extends Exception {
    UnderageException(String message) {
        super(message);
    }
}

class InvalidPercentageException extends Exception {
    InvalidPercentageException(String message) {
        super(message);
    }
}

class NotFitForAdmissionException extends Exception {
    NotFitForAdmissionException(String message) {
        super(message);
    }
}

class FeesNotPaidException extends Exception {
    FeesNotPaidException(String message) {
        super(message);
    }
}

class InsufficientFeesException extends Exception {
    InsufficientFeesException(String message) {
        super(message);
    }
}


public class AdmissionForm {

    String studentName;
    int age;
    double percentage;
    double courseFees;
    double feesPaid;

    AdmissionForm(String studentName, int age, double percentage,
                  double courseFees, double feesPaid) {

        this.studentName = studentName;
        this.age = age;
        this.percentage = percentage;
        this.courseFees = courseFees;
        this.feesPaid = feesPaid;
    }


    public void validateForm()
            throws EmptyNameException,
                   UnderageException,
                   InvalidPercentageException,
                   NotFitForAdmissionException,
                   FeesNotPaidException,
                   InsufficientFeesException {

        // 1. Empty Name
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new EmptyNameException(
                    "Student name cannot be empty."
            );
        }

        // 2. Underage
        if (age < 17) {
            throw new UnderageException(
                    "Student must be at least 17 years old."
            );
        }

        // 3. Invalid Percentage
        if (percentage < 0 || percentage > 100) {
            throw new InvalidPercentageException(
                    "Percentage must be between 0 and 100."
            );
        }

        // 4. Not Fit for Admission
        if (percentage < 35) {
            throw new NotFitForAdmissionException(
                    "Student is not fit for admission."
            );
        }

        // 5. Fees Not Paid
        if (feesPaid == 0) {
            throw new FeesNotPaidException(
                    "Fees have not been paid."
            );
        }

        // 6. Insufficient Fees
        if (feesPaid < 0.30 * courseFees) {
            throw new InsufficientFeesException(
                    "Minimum 30% of course fees must be paid."
            );
        }

        System.out.println("Admission Successful!");
    }


    public static void main(String[] args) {

        AdmissionForm form = new AdmissionForm(
                "Ghanshyam",20,110,100000,30000 );

        try {
            form.validateForm();
        }

        catch (EmptyNameException e) {
            System.out.println(e.getMessage());
        }

        catch (UnderageException e) {
            System.out.println(e.getMessage());
        }

        catch (InvalidPercentageException e) {
            System.out.println(e.getMessage());
        }

        catch (NotFitForAdmissionException e) {
            System.out.println(e.getMessage());
        }

        catch (FeesNotPaidException e) {
            System.out.println(e.getMessage());
        }

        catch (InsufficientFeesException e) {
            System.out.println(e.getMessage());
        }
    }
}