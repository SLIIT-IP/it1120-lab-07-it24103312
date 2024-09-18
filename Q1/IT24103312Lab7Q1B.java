import java.util.Scanner;

public class IT24103312Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            String[] marksInput = scanner.nextLine().split(" ");
            int[] marks = new int[4];

            for (int i = 0; i < 4; i++) {
                marks[i] = Integer.parseInt(marksInput[i]);
            }

            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }

            double average = (double) sum / 4;
            String grade = "";

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
        }
    }
}