package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackandQueueTest {
    Stack stack;
    Queue queue;

    @Before
    public void initStackAndQueue() {
        stack = new Stack();
        queue = new Queue();
    }

    @Test
    public void checkEmptyStackAndQueueTest() {
        assertEquals("An empty stack cannot pop","Stack is empty", stack.pop());
        assertEquals("An empty queue cannot dequeue", "Queue is empty", queue.dequeue());
        assertEquals("Stack is empty when first initialized",true, stack.isEmpty());
        assertEquals("Queue is empty when first initialized",true, queue.isEmpty());

    }

    @Test
    public void pushPopStackAndQueueTest() {
        //Push new value into stack
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        //Enqueue new value into queue
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        //Stack test
        assertFalse("Stack should not be empty after data is pushed.",stack.isEmpty());
        assertEquals("The method should return the top value of the stack",8, stack.top.data);
        stack.pop();
        assertEquals("The method should return the top value of the stack",7, stack.top.data);
        stack.push(9);
        assertEquals("The method should return the top value of the stack",9, stack.top.data);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals("The method should return true if the stack is empty",true, stack.isEmpty());
        assertEquals("Cannot pop from an empty stack","Stack is empty", stack.pop());

        //Queue test
        assertFalse("Queue should not be empty after data is pushed", queue.isEmpty());
        assertEquals("The method should return the first value of the queue",5, queue.front.data);
        queue.dequeue();
        assertEquals("The method should return the top value of the stack",6, queue.front.data);
        queue.dequeue();
        queue.dequeue();
        assertEquals("The method should return the first item on the queue",8, queue.front.data);
        queue.dequeue();
        assertEquals(true, queue.isEmpty());
        assertEquals("Cannot deque from an empty queue","Queue is empty",queue.dequeue());

    }

    @Test
    public void peekStackAndQueueTest() {
        assertEquals("There is no value to peek in an empty stack","Stack is empty", stack.peek());
        assertEquals("There is no vlaue to peek in an empty queue","Queue is empty", queue.peek());


        //Push new value into stack
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        //Enqueue new value into queue
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);



        //Test peek method for stack
        assertTrue("The method should peek the first value in the stack", stack.peek().equals(8));
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue("The method should peek the first value in the stack", stack.peek().equals(5));
        stack.pop();
        stack.peek().equals("Stack is empty");

        //Test peek method for queue
        assertTrue("The method should peek the first value in the stack", queue.peek().equals(5));
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue("The method should peek the first value in the stack", queue.peek().equals(8));
        queue.dequeue();
        queue.peek().equals("Queue is empty");

    }

    @Test
    public void pseudoQueueTest() {
        PseudoQueue pseudoQueue = new PseudoQueue();

        for (int i = 0; i < 25; i++) {
            pseudoQueue.enqueue(i);
        }
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();

        assertTrue("The method should peek the first value in the stack", pseudoQueue.peek().equals(2));
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        assertTrue("The method should peek the first value in the stack", pseudoQueue.peek().equals(4));
        assertTrue("The method should peek the first value in the stack", pseudoQueue.peek().equals(4));

        pseudoQueue.enqueue(26);
        assertEquals("The method should return the value that has been dequed from the queue","4", pseudoQueue.dequeue().toString());
        assertTrue("The method should peek the first value in the queue", pseudoQueue.peek().equals(5));

    }


}