package Stack;

public class StackWithArrays {
    int arr[];
    int top;
    int capacity;
    public StackWithArrays(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    public void push(int data){
        if(top == capacity-1)
            System.out.println("Stack is full");
        top++;
        arr[top] = data;
    }
    public void pop(){
        if(top == -1)
            System.out.println("No elements to pop");
    int result = arr[top];
    top--;
    System.out.println("Popped element is : "+result);
    }
    public void peek(){
        System.out.println("Peek is "+arr[top]);
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int size(){
        return top+1;
    }

    public static void main(String args[]){
        StackWithArrays s1 = new StackWithArrays(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.pop();
        s1.peek();
        System.out.println("Size is " + s1.size());
    }
}
