package LinkedList;

public class PalindromeLL {
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

        public Node reverse(Node node){
            if(node == null || node.next == null)
                return node;
            Node newHead = reverse(node.next);
            Node nextHead = node.next;
            nextHead.next = node;
            node.next = null;
            return newHead;
        }
        public Node findMiddle(){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            if(fast == null)
            return slow;
            else
                return slow.next;
        }

        public boolean isPalindrome(){
            Node mid = findMiddle();
            Node last = reverse(mid);
            Node first = head;
            while(last != null){
                if(first.data != last.data)
                    return false;
                first = first.next;
                last = last.next;
            }
            return true;
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
        System.out.println(ll.isPalindrome());

    }
}
