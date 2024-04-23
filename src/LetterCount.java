
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a string with exactly 5 letters.\n");
        String word = keyboard.next();
        int l = 0;
        if (word.length() != 5 )
        {
            System.out.println("please input a 5 letter word");
            System.exit(0);
        }
        System.out.println("Please pick a letter to count in your word!");
        char letter = keyboard.next().charAt(0);
        for (int i = 0; i < 5; i++) {
            if(letter == word.charAt(i)) {
                l++;
            }
        }
        System.out.println(word + " has " + letter + " in it " + l + " times");

    }
}

