package Assignment;
import java.util.Scanner;

public class TestStack {

    public static void main(String[] args) {

        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Enter you choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter value to be pushed...");
                    int p = sc.nextInt();
                    s.push(p);
                    break;

                case 2:
                    System.out.println("pop...");
                    System.out.println(s.pop());
                    break;
            }
        }
    }
}
