
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("""
                            Please input a operator,                     
                            (1) +
                            (2) -
                            (3) * 
                            (4) /
                          --------
                          """);
        int operator = keyboard.nextInt();
        if (operator == 1){
            System.out.println("Please enter the first number you would like to add");
            int numberOne = keyboard.nextInt();
            System.out.println("please enter the second number you would like to add");
            int numberTwo = keyboard.nextInt();
            System.out.println("the answer is " + numberOne + numberTwo);
        }
        else if (operator == 2){
            System.out.println("Please enter the first number you would like to subtract");
            int numberOne = keyboard.nextInt();
            System.out.println("please enter the second number you would like to subtract");
            int numberTwo = keyboard.nextInt();
            System.out.println("the answer is " + (numberOne - numberTwo));
        }
        else if (operator == 3){
            System.out.println("Please enter the first number you would like to multiply");
            int numberOne = keyboard.nextInt();
            System.out.println("please enter the second number you would like to multiply");
            int numberTwo = keyboard.nextInt();
            System.out.println("the answer is " + numberOne * numberTwo);
        }
        else if (operator == 4){
            System.out.println("Please enter the first number you would like to divide");
            int numberOne = keyboard.nextInt();
            if (numberOne == 0){
                System.out.println("Cannot divide by 0");
                System.exit(0);
            }
            System.out.println("please enter the second number you would like to divide");
            int numberTwo = keyboard.nextInt();
            if (numberTwo == 0){
                System.out.println("Cannot divide by 0");
                System.exit(0);
            }
            System.out.println("the answer is " + numberOne / numberTwo);
        }
        else {
            System.exit(0);



        }
    }
}