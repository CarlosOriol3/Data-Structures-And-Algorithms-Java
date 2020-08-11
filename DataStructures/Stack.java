package DataStructures;


public class Stack<T> {

    private int length = 0;
    private Node<T> top = null;
    private Node<T> bottom = null;

    public T peek() {
        if (this.length == 0) {
            return null;
        } else {
            return this.top.value;
        }
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.length == 0) {
            this.top = newNode;
            this.bottom = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
        this.length++;
    }

    public T pop() {
        if (this.length == 0) {
            return null;
        } else {
            Node<T> popNode = this.top;
            this.top = popNode.next;
            this.length--;
            return popNode.value;
        }

    }

    public int getLength() {
        return this.length;
    }

    public T getTop() {
        return this.top.value;
    }

    public T getBottom() {
        return this.bottom.value;
    }

    public String toString() {
        Node<T> currentNode = this.top;
        String result = "";

        while (currentNode != null) {
            result += currentNode.value;
            result+='\n';
            currentNode = currentNode.next;
        }
        return result;
    }
}