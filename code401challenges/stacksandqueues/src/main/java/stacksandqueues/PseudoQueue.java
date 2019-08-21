package stacksandqueues;

public class PseudoQueue {
    Stack s1, s2;
    PseudoQueue() {
        s1 = new Stack();
        s2 = new Stack(); //Main stack that holds the data
    }

    public <T> void enqueue(T value) {

        if(s2.isEmpty()) {
            s2.push(value);
            return;
        }
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(value); //push the value

        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }

    public <T> T dequeue() {
        T dequeuedValue;
        if (s1.isEmpty() && s2.isEmpty()) {
            dequeuedValue = (T) "Queue is empty";
        } else {
            dequeuedValue = s2.pop(); // pop the first element in the s2 stack

        }
        return dequeuedValue;
    }

    public <T> T peek() {
        return s2.peek();
    }
}
