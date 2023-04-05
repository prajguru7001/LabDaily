package Assignment.EmployeeStack;

public class GrowableStack implements StackInterface{

    Employee m[] = new Employee[2];

    int top = -1;

    public void push(Employee emp) {
        if (top < m.length - 1) {
            top += 1;
            m[top] = emp;
        } else {

            Employee temp [] = new Employee[m.length];
            temp = m;
            m = new Employee[(m.length)*2];

            for (int i =0; i< temp.length;i++){
                m[i] = temp[i];
                m[top] = emp;
                top++;
            }
        }
    }
    Employee popval;
    public Employee pop(){

        if (top == -1) {
            System.out.println("Stack Underflow...");
        } else {
            popval = m[top];
//            e[top] = null;
            top -= 1;
        }
        return popval;
    }
}
