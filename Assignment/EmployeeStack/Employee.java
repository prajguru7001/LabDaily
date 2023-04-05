package Assignment.EmployeeStack;

public class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "id"+id+"\nname"+name+"\nsalary"+salary;
    }

}
