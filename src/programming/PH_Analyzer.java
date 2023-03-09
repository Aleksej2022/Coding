package programming;

import java.util.Scanner;

public class PH_Analyzer {
    static double sol_con;
    static double PH;
    static double POH;
    static String res;

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        System.out.println(ANSI_Colors.BLUE_BOLD + "Hit the enter key to start");
        String begin = text.nextLine();
        do {
            System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT);
            System.out.println("    _");
            System.out.println("   | | Creativity, intuition, astuteness, and logic");
            System.out.println("   { }  and thunderbolts that spark endless");
            System.out.println("  [   ]  innovations in the minds of  |");
            System.out.println(" (_____); computer scientist.  |    -Alex Hitch-");

            //Display the main menu
            System.out.println(ANSI_Colors.GREEN_BRIGHT + "What would you like to find?\n1.PH\n2.POH\n3.[H+]\n4.[OH-]\n");
            int user_choice = number.nextInt();
            switch (user_choice) {
                case 1:
                    System.out.println(ANSI_Colors.RESET + "Is the solution A - Acid B - Basic?");
                    res = text.nextLine();
                    if (res.equals("A")) {
                        System.out.println("Enter the hydrogen concentration of the solution in moles");
                        sol_con = number.nextDouble();
                        PH = (Math.log10(sol_con));
                        System.out.print("The PH value of the solution is ");
                        System.out.printf("%.1f", PH);
                        System.out.println();
                    } else if (res.equals("B")) {
                        System.out.println("Do you know the POH value(Yes or No)? ");
                        String resnew = text.nextLine();
                        if (resnew.equals("Yes")) {
                            System.out.println("Please enter the POH value");
                            POH = number.nextDouble();
                            PH = 14 - POH;
                            System.out.print("The PH value of the solution is ");
                            System.out.printf("%.1f", PH);
                            System.out.println();
                        } else if (resnew.equals("No")) {
                            System.out.println("Enter the hydroxide ion concentration of the solution in moles");

                            sol_con = number.nextDouble();
                            POH = (-Math.log10(sol_con));
                            System.out.print("The POH value of the solution is ");
                            System.out.printf("%.1f", POH);
                            System.out.println();
                            PH = 14 - POH;
                            System.out.print("The PH value of the solution is ");
                            System.out.printf("%.1f", PH);
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    System.out.println(ANSI_Colors.RESET + "Is the solution A - Acid B - Basic?");
                    res = text.nextLine();
                    if (res.equals("A")) {
                        System.out.println("Do you know the PH value of the solution(Yes or No)? ");

                        String resnew = text.nextLine();
                        if (resnew.equals("Yes")) {
                            System.out.println("Please enter the PH value");
                            PH = number.nextDouble();
                            POH = 14 - PH;
                            System.out.print("The POH value of the solution is ");
                            System.out.printf("%.1f", POH);
                            System.out.println();
                        } else if (resnew.equals("No")) {
                            System.out.println("Enter the hydrogen ion concentration of the solution in moles");

                            sol_con = number.nextDouble();
                            PH = (-Math.log10(sol_con));
                            System.out.print("The PH value of the solution is ");
                            System.out.printf("%.1f", PH);
                            System.out.println();
                            POH = 14 - PH;
                            System.out.print("The POH value of the solution is ");
                            System.out.printf("%.1f", POH);
                            System.out.println();
                        }

                    } else if (res.equals("B")) {
                        System.out.println("Enter the hydroxide ion concentration of the solution in moles");
                        sol_con = number.nextDouble();
                        POH = (Math.log10(sol_con));
                        System.out.print("The POH value of the solution is ");
                        System.out.printf("%.1f", POH);
                        System.out.println();
                    }

                    break;
                case 3:
                    //Finding the hydrogen ion concentration of an acidic solution
                    System.out.println(ANSI_Colors.ROSY_PINK + "Enter the PH value of the acidic solution");
                    PH = number.nextDouble();
                    double hydro_con = Math.pow(10, (-(PH)));
                    System.out.println(ANSI_Colors.RESET + "The hydrogen ion concentration in your solution in moles " + hydro_con);
                    break;
                case 4:
                    //Finding the hydroxide ion concentration of a basic solution
                    System.out.println(ANSI_Colors.ROSY_PINK + "Enter the POH value of the acidic solution");
                    POH = number.nextDouble();
                    double hydroxide_con = Math.pow(10, (-(POH)));
                    System.out.println(ANSI_Colors.RESET + "The hydroxide ion concentration in your solution in moles " + hydroxide_con);
                    break;
                default:
                    System.out.println(ANSI_Colors.RED_BRIGHT + "Sorry you have entered an incorrect option!");
                    break;
            }
            System.out.println(ANSI_Colors.BLUE_BOLD + "Hit the enter key to start");
            begin = text.nextLine();


        } while (begin.equals(""));
        if (!begin.equals("")){
            System.out.println(ANSI_Colors.RESET + "Okay, have a nice day!");
        }
    }
}

