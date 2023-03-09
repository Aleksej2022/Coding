package programming;

import java.util.Scanner;

public class Pythagorian_Calculator {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        System.out.println(ANSI_Colors.RED_BRIGHT);
        System.out.println("|\"");
        System.out.println("| \"");
        System.out.println("|  \"");
        System.out.println("|   \"");
        System.out.println("|    \"");
        System.out.println("|     \"");
        System.out.println("|      \"");
        System.out.println("|       \"");
        System.out.println("|        \"");
        System.out.println("|         \"");
        System.out.println("|          \"");
        System.out.println("|           \"");
        System.out.println("|            \"");
        System.out.println("|             \"");
        System.out.println("|              \"");
        System.out.println("|               \"");
        System.out.println("|________________\"");
        System.out.println("********************************");

        // Program Start
        System.out.println(ANSI_Colors.RESET + "Are you ready to begin(Yes or No)?");
        String response = text.nextLine();
        while (response.equals("Yes")){
            System.out.println(ANSI_Colors.BLUE_BOLD_BRIGHT + "Which side of the right angle triangle would do you like to find?\nA.Hypotenuse\nB.Perpendicular\nC.Opposite\n");
            String side_choice = text.nextLine();
            switch (side_choice){
                case "A":
                    System.out.println(ANSI_Colors.RESET + "Enter the length of the perpendicular side of right angle");
                    double perpen_len = number.nextDouble();
                    System.out.println("Enter the length of the opposite side of the right angle triangle");
                    double opp_len = number.nextDouble();
                    double hypot = Math.hypot(perpen_len,opp_len);
                    System.out.println(ANSI_Colors.GREEN_BOLD_BRIGHT + "The length of the hypotenuse is " + hypot);
                    break;
                case "B":
                    System.out.println(ANSI_Colors.RESET + "Enter the length of the hypotenuse of the right angle triangle");
                    double hypo_len = number.nextDouble();
                    System.out.println("Enter the length of the opposite side of the right angle triangle");
                    double opp_len2 = number.nextDouble();
                    double calcualate_perpenLen = Math.sqrt(Math.pow(hypo_len,2) - Math.pow(opp_len2,2));
                    System.out.println("The length of the perpendicular side is: " + calcualate_perpenLen);
                    break;
                case "C":
                    System.out.println(ANSI_Colors.RESET + "Enter the length of the hypotenuse of the right angle triangle");
                    double hypo_len2 = number.nextDouble();
                    System.out.println("Enter the length of the perpendicular side of the right angle triangle");
                    double perpen_len2 = number.nextDouble();
                    double calcualate_oppLen = Math.sqrt(Math.pow(hypo_len2,2) - Math.pow(perpen_len2,2));
                    System.out.println("The length of the opposite side is: " + calcualate_oppLen);
                    break;
                default:
                    System.out.println(ANSI_Colors.RED_BRIGHT + "Sorry, you have entered an incorrect option!");
            }
            System.out.println(ANSI_Colors.RESET + "Are you ready to begin(Yes or No)?");
            response = text.nextLine();
        }
        if (response.equals("No")){
            System.out.println("Okay, have a great day!");
        }
    }
}
