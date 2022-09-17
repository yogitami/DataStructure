package LinkedList;

public class ReverseLL {
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

        public Node getAt(int index) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }

        public void reverseLLData(){
            Node current = head;
            int li = 0;
            int ri = size-1;
            while(li < ri){
                Node left = getAt(li);
                Node right = getAt(ri);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                li++;
                ri--;
            }

        }

        public void reverseLL(){
            Node current = head;
            Node prev = null;
            while(current != null){
                Node temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            head = prev;
        }

        public Node reverseRecurively(Node head){
            if(head == null || head.next == null)
                return head;
            Node newHead = reverseRecurively(head.next);
            Node nextHead = head.next;
            nextHead.next = head;
            head.next = null;
            return newHead;
        }
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addInLL(2);
        ll.addInLL(5);
        ll.addInLL(1);
        ll.addInLL(8);
        ll.addInLL(3);
        ll.printList();
        System.out.println("--------");
//        ll.reverseLL();
//        ll.printList();
//        System.out.println("--------");
//        System.out.println(ll.size);
//        System.out.println("--------");
//        ll.reverseLLData();
//        ll.printList();
//        System.out.println("--------");
        ll.reverseRecurively(ll.head);
        ll.printList();
        System.out.println("------");
    }
}
