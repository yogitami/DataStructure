package LinkedList;

//sorted linked list and merge them
public class MergeLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class LinkedList {
       Node head;
       Node tail;
        int size = 0;
        public void addInLL(int data) {
            Node newNode = new Node(data);
            if (size == 0) {
                head = newNode;
                tail = newNode;
                size++;
            } else {
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
            System.out.println();
        }

        public void sortList(){
            Node first = head;
            Node second = head.next;
            while(second != null){
                first = first.next;
                second = second.next;

            }
        }

    }
    public static void main(String args[]){
       LinkedList ll = new LinkedList();
        ll.addInLL(2);
        ll.addInLL(5);
        ll.addInLL(1);
        ll.addInLL(1);
        ll.addInLL(6);
        ll.addInLL(2);
        ll.printList();
        System.out.println("--------");


    }

}
