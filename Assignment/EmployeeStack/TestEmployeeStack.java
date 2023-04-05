package Assignment.EmployeeStack;

public class TestEmployeeStack {

    public static void main(String[] args) {

        StackInterface s = new FixedStack();
        StackInterface g = new GrowableStack();
        Employee e = new Employee(101,"vinit",10000);
        Employee e1 = new Employee(102,"raj", 100000);

        s.push(e);
        s.push(e1);
      //  s.push(e);
       // s.push(e1);
        s.pop();
        s.pop();
       // s.pop();
      //  s.pop();
      //  s.pop();

        System.out.println("+++++");


        g.push(e);
        g.push(e1);
       // g.push(e);
        g.pop();
        g.pop();
//        g.pop();
//        g.pop();
//        g.pop();
//        g.pop();



        System.out.println(g);


    }

}
