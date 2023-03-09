package programming;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

    static int user_score = 0;
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Would you like to play (Yes or No)?");
        String response = text.nextLine();

        do {
            for (int num = 0; num <= 3; num++) {
                if (num == 1) {
                    int computer_choice = random.nextInt(20);
                    System.out.println(computer_choice);
                    System.out.println(ANSI_Colors.RED + "Your first guess, guess the number the computer picked from 1 to 20");
                    int user_guess = number.nextInt();
                    if (user_guess == computer_choice) {
                        System.out.println(ANSI_Colors.PURPLE_BOLD + "You guessed the number correctly!");
                        user_score = user_score + 1;
                    } else if (user_guess != computer_choice) {
                        System.out.println(ANSI_Colors.RED + "You guessed the numbers incorrectly!");
                    }
                } else if (num == 2) {
                    int computer_choice = random.nextInt(20);
                    System.out.println(computer_choice);
                    System.out.println(ANSI_Colors.RED + "Your second guess, guess the number the computer picked from 1 to 20");
                    int user_guess = number.nextInt();
                    if (user_guess == computer_choice) {
                        System.out.println(ANSI_Colors.PURPLE_BOLD + "You guessed the number correctly!");
                        user_score = user_score + 1;
                    } else if (user_guess != computer_choice) {
                        System.out.println(ANSI_Colors.RED + "You guessed the numbers incorrectly!");
                    }
                } else if (num == 3) {
                    int computer_choice = random.nextInt(20);
                    System.out.println(computer_choice);
                    System.out.println(ANSI_Colors.RED + "Your third guess, guess the number the computer picked from 1 to 20");
                    int user_guess = number.nextInt();
                    if (user_guess == computer_choice) {
                        System.out.println(ANSI_Colors.PURPLE_BOLD + "You guessed the number correctly!");
                        user_score = user_score + 1;
                    } else if (user_guess != computer_choice) {
                        System.out.println(ANSI_Colors.RED + "You guessed the numbers incorrectly!");
                    }
                }
                System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "You got " + user_score + " out of 3 guesses in total");
            }

            System.out.println("Would you like to play (Yes or No)?");
            response = text.nextLine();

            user_score = 0;
        } while (response.equals("Yes"));
            if (response.equals("No")){
                System.out.println(ANSI_Colors.RESET + "Okay, thank you!");
            }

    }
}
