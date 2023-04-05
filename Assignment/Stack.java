package Assignment;

public class Stack {

    int arr [] = new int[2];
    int top = -1 ;
  //  private final int stacklength = 5;

    public void push (int i){
        if(top < arr.length-1){
            top+=1;
            arr[top] = i;
        }
        else{
            System.out.println("Stack Overflow...");
        }
    }

    int popval = 0;
    public int pop(){

        if(top == -1){
            System.out.println("Stack Underflow...");
        }
        else{
            popval = arr[top];
            arr[top] = 0;
            top-=1;
        }
        return popval;

    }
}
