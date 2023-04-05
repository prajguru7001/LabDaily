package Assignment;

import java.util.*;

public class Hotel{

    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        System.out.println("\n\n******************** MENU CARD ********************");
        System.out.println("\n 1. Tea\t\t 10\n 2. Coffee\t 20\n 3. Sandwich\t 50\n 4. Vada-pav\t 15\n 5. Misal\t 60\n");
        System.out.println("Enter 6 to Generate Bill...\n");
        int total = 0;

        while(true){
            System.out.print("\nEnter Your Choice: ");
            int order = num.nextInt();

            switch(order){

                case 1:
                    System.out.println("1 Tea");
                    total += 10;
                    break;

                case 2:
                    System.out.println("1 Coffee");
                    total += 20;
                    break;

                case 3:
                    System.out.println("1 Sandwich");
                    total += 50;
                    break;
                case 4:
                    System.out.println("1 Vada-pav");
                    total += 15;
                    break;
                case 5:
                    System.out.println("1 Misal");
                    total += 60;
                    break;
                case 6:
                    System.out.println("\n***** Your Bill... "+total+". *****");
                    System.exit(0);

                default:
                    System.out.println("Please Enter Correct Option :)");
                    break;
            }
        }
    }
}
