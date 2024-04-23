import java.util.Scanner;

public class Problem4Solve {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter current salary (do not include $): ");
        double salary = keyboard.nextDouble();
        double raisePercent = 1.1; //10% raise
        System.out.print("How many years have you been on the job? ");
        int yearsOnJob = keyboard.nextInt();
        System.out.print("Have you had any complaints since starting this position? ");
        keyboard.nextLine(); //flushing the stream
        String complaints = keyboard.next();
        boolean hasComplaints = complaints.equalsIgnoreCase("yes"); //always returns true or false
        if (hasComplaints && yearsOnJob >= 2) {
            System.out.println("You are eligible for a raise!");
            System.out.printf("Your salary would go from $%,.2f to $%,.2f.", salary, (salary * raisePercent));
        }  else {
            System.out.println("You are not eligible for a raise. Must have been here 2+ years and no complaints.");
        }
    }
}