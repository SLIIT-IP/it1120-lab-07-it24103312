import java.util.Scanner;

public class IT24103312Lab7Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().toUpperCase().charAt(0);

            double discount = 0;
            if (paymentMode == 'C') {
                discount = billAmount * 0.05;
            } else if (paymentMode != 'O') {
                System.out.println("Payment Mode is Not Valid");
                continue;
            }

            double amountToBePaid = billAmount - discount;

            if (discount > 0) {
                System.out.println("Discount is: " + discount);
            } else {
                System.out.println("No discount applicable");
            }
            System.out.println("Amount to be paid: " + amountToBePaid);
            System.out.println();
        }

        scanner.close();
    }
}