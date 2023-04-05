package Assignment;

public class Swap2{

    public static void main(String [] args){

        int a, b;

        a = 20; b = 30;

        System.out.println("The two numbers are a = "+a+" and b = "+b+".");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swaped numbers are: a = "+a+" and b = "+b+".");

    }

}
