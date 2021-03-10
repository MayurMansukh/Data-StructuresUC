

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

            if(head != tail) {
                head = head.Next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void deleteLastElement() { // delete last element in list
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.Next != tail) {
                    current = current.Next;
                }
                tail = current;
                tail.Next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void searchNode(int data) { // search node with key
        Node current = head;
        int i = 1;
        boolean flag = false;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.Next;
            }
        }
        if(flag)
            System.out.println("Element " +data+ " is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }

    public void insertAfter(Node prev_node, int new_data) // add node after given node
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);

        new_node.Next = prev_node.Next;

        prev_node.Next = new_node;
    }

    void deleteGivenNode(int key) // delete given node in linked list
    {

        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.Next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.Next;
        }
        if (temp == null)
            return;

        prev.Next = temp.Next;
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
        list.addNode(40);
        list.addNode(70);
        list.displayList();

        list.deleteGivenNode(40);
        list.displayList();

//        list.addAtStart(70);
//        list.addAtStart(30);
//        list.addAtStart(56);
//        list.addAtEnd(56);
//        list.addAtEnd(70);
//        list.addAtmiddle(30,1);





    }

}
