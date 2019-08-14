package datastructure;

public  class LinkedList {
    Node head; // Head of the linked list

    LinkedList() {
        this.head = null;
    }

    public class Node {
        int value;  // The value for the Node
        Node next;  // Reference to the next node in the list


        //Constructor
        Node(int data) {
            value = data; //Assign the value that is passed
            next = null;  // Point next node null

        }

    }

    public void insert (int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;  // new node becomes the head
        } else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }

    }


    public boolean includes (int value) {
        Node temp = head;

        while(temp != null) {
            if(temp.value == value) {
                return true;
            }
            temp = temp.next;

        }
        return false;

    }


    public String toString() {
        Node temp = head;
        String returnString = "HEAD";
        while (temp != null) {
            returnString += " -> " + Integer.toString(temp.value);
            temp = temp.next;
        }
        if (returnString.isEmpty()) {
            returnString += " -> NULL";
        }
        return returnString + " -> NULL";
    }

    public void append(int value) {
        Node temp = head;
        Node newNode = new Node(value);

        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;

    }

    public void insertBefore (int value, int newValue) {
        Node newNode = new Node(newValue);
        //Edge case: first element on the linked list is the value
        if (head.value == value) {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.next != null && current.next.value == value) {
                newNode.next = current.next;
                current.next = newNode;
                return;

            }
            current = current.next;
        }

    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node current = head;

        while (current != null) {
            if (current.value == value) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public int kFromEnd(int k) {
        //check k length greater than linked listWhere k is greater than the length of the linked list
        //Where k and the length of the list are the same
        //Where k is not a positive integer
        //Where the linked list is of a size 1
        //“Happy Path” where k is not at the end, but somewhere in the middle of the linked list

        //Edge case for negative value
        if (k < 0) {
            return -1;
        }
        Node current = head;
        int listLength = 0;
        while (current != null) {
            listLength++;
            current = current.next;
        }

        if(k > listLength) {
            return -1;  //Exception
        }
        current = head;
        int index = listLength - 1;
        while (current != null) {
            if (index == k) {
                return current.value;
            }
            index--;
            current = current.next;
        }

        return -1;

    }



}

