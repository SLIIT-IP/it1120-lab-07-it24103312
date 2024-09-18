import java.util.Scanner;

public class IT24103312Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");

        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            int marks = scanner.nextInt();
            sum += marks;
        }

        double average = (double) sum / 4;
        System.out.println("Average is : " + average);

        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("Overall Grade is : " + grade);
    }
}