package DataStructures;

public class LinkedList<T> {
    private int length = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public void remove(int index) {
        Node<T> currentNode = this.head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        Node<T> nextNode = currentNode.next;
        currentNode.next = nextNode.next;
        this.length--;
    }

    public int getLength() {
        return this.length;
    }

    public T getHead() {
        return this.head.value;
    }

    public T getTail() {
        return this.tail.value;
    }

    public String toString() {
        Node<T> currentNode = this.head;
        String listResult = "";
        while (currentNode != null) {
            listResult += currentNode.value + " ";
            currentNode = currentNode.next;
        }
        return listResult;
    }

   
}