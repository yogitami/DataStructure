package Stack;

public class StackWithLL {

    Node head;
    int size;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public StackWithLL(){
        head = null;
        size = 0;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        size++;
        head = temp;
    }
    public void pop(){
        if(head == null)
            System.out.println("No element to pop");
        int res = head.data;
        head = head.next;
        System.out.println("Popped element is : "+res);
    }
    public void peek(){
        if(head == null)
            System.out.println("No element to peek");
        System.out.println(head.data);
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }

    public static void main(String args[]){

    }
}
