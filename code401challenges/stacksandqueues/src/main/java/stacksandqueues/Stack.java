package stacksandqueues;

public class Stack {
    Node top;

    //Constructor for empty stack
    public Stack() {
        this.top = null;
    }

    //Check if the stack is empty
    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    //Pushes new data into the stack
    public <T> void push(T value) {
        Node stackNode = new Node(value);

        //Nothing has been in the stack
        if (top == null) {
            top = stackNode;
        } else {
            Node temp = top;
            top = stackNode;
            top.next = temp;
        }
    }

    //Pop method
    public <T> T pop() {
        T poppedValue;
        if(isEmpty()) {
            poppedValue = (T) "Stack is empty";
        } else {
            poppedValue = (T) top.data;
            top = top.next;
        }
        return poppedValue;
    }

    //Peek method
    public <T> T peek() {
        T peekedValue;
        if(isEmpty()) {
            peekedValue = (T) "Stack is empty";
        } else {
            peekedValue = (T) top.data;
        }
        return peekedValue;
    }




}
