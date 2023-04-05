package Assignment;

import java.util.*;

public class Calculator{

    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        while(true){
            System.out.println("\n\n****************************** CALCULATOR ******************************");
            System.out.println("This Calculator performs simple arithmatic operations on two numbers.\n");
            System.out.println("1. Addition\t 2. Subtraction\t 3. Multiplication\t 4. Division\t 5. Modulus\n");
            System.out.println("Enter 6 to Exit...\n");

            System.out.print("\nEnter Your Choice: ");
            int inp = num.nextInt();

            if(inp == 6){
                System.exit(0);
            }
            System.out.print("Enter First Number: ");
            int num1 = num.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = num.nextInt();

            switch(inp){
                case 1:
                    System.out.println("\nAddition of entered numbers is "+(num1+num2)+".");
                    break;

                case 2:
                    System.out.println("\nSubtraction of entered numbers is "+(num1-num2)+".");
                    break;

                case 3:
                    System.out.println("\nMultiplication of entered numbers is "+(num1*num2)+".");
                    break;

                case 4:
                    System.out.println("\nDivision of entered numbers is "+(num1/num2)+".");
                    break;

                case 5:
                    System.out.println("\nModulus of entered numbers is "+(num1%num2)+".");
                    break;

                default:
                    System.out.println("\nENTER VALID INPUT...!!!");
            }
        }
    }
}
