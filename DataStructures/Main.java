package DataStructures;

public class Main {
    public static void main(String[] args) {

        //Linked List: 
        
        // LinkedList<Integer> myList = new LinkedList<>();
        // myList.add(12);
        // myList.add(23);
        // myList.add(2);
        // myList.add(56);
        // myList.add(6);
        // myList.add(8);

        // System.out.println(myList.toString());

        // System.out.println(myList.getLength());

        // myList.remove(2);

        // System.out.println(myList.toString());

        // System.out.println(myList.getLength());

        // System.out.println(myList.getHead());

        // System.out.println(myList.getTail());



        //Stack:

        // Stack<Integer> myStack = new Stack<>();
        // myStack.push(12);
        // myStack.push(2);
        // myStack.push(1);
        // myStack.push(4);
        // myStack.push(45);
        // myStack.push(78);

        
        
        // System.out.println(myStack.toString());
        // System.out.println(myStack.pop());
        // System.out.println();
        // System.out.println(myStack.toString());

        //Binary Search Tree
        BinarySearchTree myTree = new BinarySearchTree();
        myTree.insert(9);
        myTree.insert(4);
        myTree.insert(6);
        myTree.insert(20);
        myTree.insert(170);
        myTree.insert(15);
        myTree.insert(1);

        System.out.println("preorder: "+myTree.preorderToString());
        System.out.println("inorder: "+myTree.inorderToString());
        System.out.println("postorder: "+myTree.postorderToString());
    }
}