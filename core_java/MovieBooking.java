package p1;

class InvalidTicketNumberException extends Exception {

    InvalidTicketNumberException(String message) {
        super(message);
    }
}

class TicketSoldOutException extends Exception {

    TicketSoldOutException(String message) {
        super(message);
    }
}

public class MovieBooking {

    static String movieName = "3 Idiots";
    static int ticketPrice = 200;
    static int remainingTicket = 50;

    public static void bookTicket(int numberOfTickets)
            throws InvalidTicketNumberException,
                   TicketSoldOutException {

        // Invalid ticket number
        if (numberOfTickets <= 0) {

            throw new InvalidTicketNumberException(
                    "Ticket Number must be greater than 0."
            );
        }

        // Ticket unavailable
        if (remainingTicket == 0 ||
            numberOfTickets > remainingTicket) {

            throw new TicketSoldOutException(
                    "Requested tickets are not available."
            );
        }

        // Calculate total amount
        int totalAmount = numberOfTickets * ticketPrice;

        // Deduct tickets only after successful validation
        remainingTicket = remainingTicket - numberOfTickets;

        System.out.println("Booking Successful!!");
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets Booked: " + numberOfTickets);
        System.out.println("Total Amount: ₹" + totalAmount);
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (remainingTicket > 0) {

            System.out.println("\nRemaining Tickets: " + remainingTicket);

            System.out.print("Enter number of tickets: ");
            int numberOfTickets = sc.nextInt();

            try {

                bookTicket(numberOfTickets);

            }
            catch (InvalidTicketNumberException e) {

                System.out.println(e.getMessage());

            }
            catch (TicketSoldOutException e) {

                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nAll tickets are sold out!!");

        sc.close();
    }
}