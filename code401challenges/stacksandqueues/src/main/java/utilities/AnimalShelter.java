package utilities;

import stacksandqueues.Animal;
import stacksandqueues.Queue;

public class AnimalShelter {
    private Queue dogQueue = new Queue();
    private Queue catQueue = new Queue();


    public String enqueuAnimal (Animal obj) {
        String message = "";
        if (obj.type == "dog") {
            dogQueue.enqueue(obj.type);
            message = "dog enqueued successfully";
        } else if (obj.type == "cat") {
            catQueue.enqueue(obj.type);
            message = "cat enqueued successfully";
        } else message = "Cannot enqueue the animal of type: " + obj.type;
        return  message;
    }

    public String dequeAnimal(Animal obj) {
        String message = "";
        if (obj.type == "dog") {
            message = "dog dequed successfully";
            dogQueue.dequeue();
            return message;
        } else if (obj.type == "cat") {
            message = "cat dequed successfully";
            catQueue.dequeue();
            return message;
        } else return null;
    }

    public void peek() {
        System.out.println(dogQueue.peek().toString());
        System.out.println(catQueue.peek().toString());
    }

}
