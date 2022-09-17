package LinkedList;

//using data swap
public class ReverLLiteratively {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size = 0;

        public void addInLL(int data){
            Node newNode = new Node(data);
            if(size == 0){
                head = newNode;
                tail = newNode;
                size++;
            }else{
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }

        public void printList(){
            Node current = head;
            while(current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }

        public Node getAt(int index){
            Node current = head;
            for(int i=0 ;i<index;i++){
                current = current.next;
            }
            return current;
        }

        public void reverseLl(){
            int li = 0;
            int ri = size-1;
            while(li<ri){
                Node leftNode = getAt(li);
                Node rightNode = getAt(ri);
                int temp = leftNode.data;
                leftNode.data = rightNode.data;
                rightNode.data = temp;
                li++;
                ri--;
            }
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
        System.out.println();
        System.out.println("--------");
        ll.reverseLl();
        ll.printList();
    }


}
