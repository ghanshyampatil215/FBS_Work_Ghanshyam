package p1;

class InvalidUsernameException extends Exception {

    InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {

    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Login {

    static String correctUsername = "Admin";
    static String correctPassword = "12345";

    public static void validateUsername(String username)
            throws InvalidUsernameException {

        if (!username.equals(correctUsername)) {
            throw new InvalidUsernameException(
                    "Invalid Username!"
            );
        }
    }

    public static void validatePassword(String password)
            throws InvalidPasswordException {

        if (!password.equals(correctPassword)) {
            throw new InvalidPasswordException(
                    "Invalid Password!"
            );
        }
    }

    public static void main(String[] args) {

        java.util.Scanner sc =
                new java.util.Scanner(System.in);

        System.out.println("Enter Username:");
        String username = sc.nextLine();

        // Username validation
        try {

            validateUsername(username);

        }
        catch (InvalidUsernameException e) {

            System.out.println(e.getMessage());
            System.out.println("Login Failed");

            sc.close();
            return;
        }

        // Password attempts
        int attempts = 3;

        while (attempts > 0) {

            System.out.println("Enter Password:");
            String password = sc.nextLine();

            try {

                validatePassword(password);

                System.out.println("Login Successful!");
                break;

            }
            catch (InvalidPasswordException e) {

                attempts--;

                System.out.println(e.getMessage());

                if (attempts > 0) {

                    System.out.println(
                            "Attempts remaining: " + attempts
                    );

                }
                else {

                    System.out.println("Account Locked!");
                }
            }
        }

        sc.close();
    }
}