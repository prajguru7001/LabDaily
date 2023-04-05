package Assignment.EmployeeStack;

public class FixedStack implements StackInterface {

    Employee e[] = new Employee[2];

    int top = -1;

    public void push(Employee emp) {
        if (top < e.length - 1) {
            top += 1;
            e[top] = emp;
        } else {
            System.out.println("Stack Overflow...");
        }
    }
    Employee popval;
    public Employee pop(){

        if (top == -1) {
            System.out.println("Stack Underflow...");
        } else {
            popval = e[top];
//            e[top] = null;
            top -= 1;
        }
        return popval;
    }
}



