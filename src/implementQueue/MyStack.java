package implementQueue;

/**
 * Created by Mayank on 9/30/16.
 */
public class MyStack {
    private int size;
    private int[] array;
    private int top;

    MyStack(int element){
        size=element;
        array=new int[size];
        top=-1;
    }

    void push(int x){
        array[++top]=x;
    }  // add element to array and increment the top counter
    int pop(){
        return array[--top];
    }  // remove the element and decrement the counter
    int peek(){
        return top;
    }  // returns the element which was most recently inserted

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(top==size-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStack stack=new MyStack(1);

        System.out.println(stack.isFull());
        System.out.println(stack.peek());
    }
}
