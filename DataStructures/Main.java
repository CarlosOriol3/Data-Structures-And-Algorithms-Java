package DataStructures;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(12);
        myList.add(23);
        myList.add(2);
        myList.add(56);
        myList.add(6);
        myList.add(8);

        System.out.println(myList.toString());

        System.out.println(myList.getLength());

        myList.remove(2);

        System.out.println(myList.toString());

        System.out.println(myList.getLength());

        System.out.println(myList.getHead());

        System.out.println(myList.getTail());

    }
}