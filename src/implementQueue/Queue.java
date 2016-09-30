package implementQueue;

// Queue: - Push the new element onto inbox

//Dequeue:
// - If outbox is empty, refill it by popping each element from inbox and pushing it onto outbox
// - Pop and return the top element from outbox

import java.util.Stack;

/**
 * Created by Mayank on 9/30/16.
 */
public class Queue<E> {
    Stack<E> inbox = new Stack<E>();
    Stack<E> outbox = new Stack<E>();

    void enQueue(E item){
        inbox.push(item);
    }

    E dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

}
