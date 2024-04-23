import java.util.Scanner;
public class Problem1Solve{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userNum = keyboard.nextInt();
        double userNum2 = keyboard.nextDouble();
        System.out.println("the sum of your numbers is:" + (userNum + userNum2));
    }
}