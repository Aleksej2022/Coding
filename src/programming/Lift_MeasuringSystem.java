package programming;

import java.util.Scanner;

public class Lift_MeasuringSystem {
    //If the Boeing 747 above is cruising at 940 km/h, the density of the air is 1.20 g/L,the wing area is 511.0 meters squared
    //and the lift coefficient is 1, what is the lift?

    public static void main(String[] args) throws Exception {
        Scanner text_object = new Scanner(System.in);
        Scanner number_object = new Scanner(System.in);
        System.out.println("Shall we start (Yes or No)?");

        String user = text_object.nextLine();
        do {
            System.out.println(ANSI_Colors.BLUE_BRIGHT);
            System.out.println(" ______ _");
            System.out.println("|  ____| |");
            System.out.println("| |__  | |_   _");
            System.out.println("|  __| | | | | |");
            System.out.println("| |    | | |_| |");
            System.out.println("|_|    |_||__, |");
            System.out.println("           __/ | ");
            System.out.println("           |___/ ");
            Thread.sleep(2000);
            System.out.println(ANSI_Colors.ROSY_PINK + "##########################################################################");
            System.out.println("Calculating the lift of the aircraft");
            System.out.println("##########################################################################");
            Thread.sleep(2000);
            System.out.println(ANSI_Colors.RESET + "Enter the aircraft type");
            String aircraftType = text_object.nextLine();
            System.out.println(ANSI_Colors.RED + "Enter the lift coefficient(CL): ->");

            double CL = number_object.nextDouble();
            System.out.println(ANSI_Colors.BLUE_BOLD + "Enter the air density(rho in kg/m3) value: ->");
            double rho = number_object.nextDouble();
            System.out.println(ANSI_Colors.GREEN_BOLD_BRIGHT + "Enter the velocity of the aircraft(m/s): ->");
            double velocity = number_object.nextDouble();
            System.out.println(ANSI_Colors.CYAN_BOLD_BRIGHT + "Enter the wing area(in meters squared) of the aircraft");
            double wing_area = number_object.nextDouble();
            double lift = CL * 1/2 * rho * Math.pow(velocity, 2) * wing_area;

            System.out.println(ANSI_Colors.ROSY_PINK + "##########################################################################");
            System.out.println("Computing the lift");
            System.out.println("##########################################################################");
            Thread.sleep(2000);

            System.out.printf("%20s %20s","The lift of the aircraft is", "");
            System.out.printf("%.2f %2s", Math.ceil(lift),"newtons");
            System.out.println();

            System.out.println("Shall we start (Yes or No)?");
            user = text_object.nextLine();

        }while (user.equals("Yes"));

        if (user.equals("No")){
            System.out.println("Okay.Have a great day!");
        }
    }
}
