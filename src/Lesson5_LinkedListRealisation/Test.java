package Lesson5_LinkedListRealisation;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(12);
        myLinkedList.add(123);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
