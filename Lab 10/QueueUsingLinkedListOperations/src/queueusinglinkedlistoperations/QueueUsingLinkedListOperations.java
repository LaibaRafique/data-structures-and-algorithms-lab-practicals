// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package queueusinglinkedlistoperations;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class QueueUsingLinkedListOperations {
    private Node front, rear;

    public QueueUsingLinkedListOperations() {
        front = rear = null;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued to the queue.");
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int dequeuedData = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        System.out.println(dequeuedData + " dequeued from the queue.");
        return dequeuedData;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingLinkedListOperations queue = 
                new QueueUsingLinkedListOperations();
        queue.enqueue(0);
        queue.enqueue(9);
        queue.enqueue(15);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue(20);
        queue.display();
    }
}
