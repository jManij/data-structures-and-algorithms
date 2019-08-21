package stacksandqueues;

public class Queue {
    Node front;
    Node rear;

    //Empty Queue
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //Checks to see if a queue is empty
    public Boolean isEmpty() {
        if(front == null) {
            return true;
        }
        return false;
    }

    //enqueue method
    public <T> void enqueue(T data) {
        Node queueNode = new Node(data);

        if(front == null) {
            front = queueNode;
            rear = queueNode;
        }
        this.rear.next = queueNode;
        this.rear = queueNode;
    }

    //Dequeu method
    public <T> T dequeue() {
        T dequeuedValue;
        if(isEmpty()) {
            dequeuedValue = (T) "Queue is empty";
        } else {
            dequeuedValue = (T) this.front.data;
            this.front = this.front.next;

            if (this.front == null) {
                this.rear = null;
            }
        }
        return dequeuedValue;
    }

    //Peek method
    public <T> T peek() {
        T peekedValue;
        if(isEmpty()) {
            peekedValue = (T) "Queue is empty";
        } else {
            peekedValue = (T) front.data;
        }
        return peekedValue;
    }







}
