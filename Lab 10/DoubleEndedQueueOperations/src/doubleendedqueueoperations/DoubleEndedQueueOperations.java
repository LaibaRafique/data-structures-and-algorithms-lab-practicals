// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package doubleendedqueueoperations;
public class DoubleEndedQueueOperations {
    private static final int MAX_SIZE = 10;
    private int[] deque;
    private int front, rear, size;
    public DoubleEndedQueueOperations() {
        deque = new int[MAX_SIZE];
        front = rear = -1;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == MAX_SIZE;
    }
    public void insertFront(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert at front.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = MAX_SIZE - 1;
        } else {
            front--;
        }
        deque[front] = element;
        size++;
    }
    public void insertRear(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert at rear.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == MAX_SIZE - 1) {
            rear = 0;
        } else {
            rear++;
        }
        deque[rear] = element;
        size++;
    }
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot delete from front.");
            return -1;
        }
        int deletedElement = deque[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == MAX_SIZE - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return deletedElement;
    }
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot delete from rear.");
            return -1;
        }
        int deletedElement = deque[rear];
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = MAX_SIZE - 1;
        } else {
            rear--;
        }
        size--;
        return deletedElement;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % MAX_SIZE;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoubleEndedQueueOperations deque = new DoubleEndedQueueOperations();
        deque.insertFront(31);
        deque.insertRear(9);
        deque.insertFront(17);
        deque.insertRear(6);
        System.out.println("Queue after insertions:");
        deque.display();
        System.out.println("Deleted element from front: " + deque.deleteFront());
        System.out.println("Deleted element from rear: " + deque.deleteRear());
        System.out.println("Queue after deletions:");
        deque.display();
    }
}
