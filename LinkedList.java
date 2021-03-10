

public class LinkedList {

    class Node{
        int data;
        Node Next;

        public Node(int data){
            this.data=data;
            this.Next=null;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data){ //add nodes in Linked List

        Node newNode=new Node(data);

        if (head==null) {

            head=newNode;
            tail=newNode;
        }
        else
            tail.Next=newNode;
            tail=newNode;

            }

    public void addAtStart(int data) { // add nodes at first postion in LinkedList

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.Next = temp;
        }
    }

    public void addAtEnd(int data) { //add nodes at end postion of Linked List
        Node newNode = new Node(data);
        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public Node addAtmiddle(int data, int position){

        Node newnode = new Node(data);
        newnode.data = data;
        Node cur = head;
        Node prev = null;
        int i = 0;
        while (i < position) {
            prev = cur;
            cur = cur.Next;
            i++;
        }
        newnode.Next = cur;
        if (prev != null) {
            prev.Next = newnode;
            return head;
        }
        return newnode;
    }


    public void deleteFirstElement() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            //Checks whether the list contains only one node
            //If not, the head will point to next node in the list and tail will point to the new head.
            if(head != tail) {
                head = head.Next;
            }
            //If the list contains only one node
            //then, it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }

    public void displayList() { // display linked List
        Node current=head;

        if (head==null){

            System.out.println("list is empty");
        }
        else {
            System.out.println("singly linked list: ");
            while (current != null) {

                System.out.println(current.data + "");
                current = current.Next;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.deleteFirstElement();

//        list.addAtStart(70);
//        list.addAtStart(30);
//        list.addAtStart(56);
//        list.addAtEnd(56);
//        list.addAtEnd(70);
//        list.addAtmiddle(30,1);

        list.displayList();



    }

}
