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


    public LinkedList mergeLists(LinkedList list1, LinkedList list2) {

        //Check for edge cases

        int l1 = 0; // length of the first list
        int l2 = 0; // length of the second list
        LinkedList mergedList = new LinkedList();

        Node current = list1.head;
        //Get length for the first list
        while (current != null) {
            l1++;
            current = current.next;
        }

        //Get length for the second list
        current = list2.head;
        while (current != null) {
            l2++;
            current = current.next;
        }

        Node firstList = list1.head;
        Node secondList = list2.head;
        int totalIndex = l1 + l2;
        int i = 0;
        while(i < totalIndex){
            if(firstList != null) {
                System.out.print(firstList.value + " ");
                i++;
                mergedList.insert(firstList.value);
                if(secondList != null) {
                    mergedList.insert(secondList.value);
                    System.out.print(secondList.value + " ");
                    i++;
                }


            }
            else if(secondList != null) {
                i++;
                mergedList.insert(secondList.value);
            }

            if (firstList != null)
            firstList = firstList.next;

            if (secondList != null)
            secondList = secondList.next;

        }



        return mergedList;



    }



}

