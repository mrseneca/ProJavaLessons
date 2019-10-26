package Lesson13_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);
        Person p4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<>(3);
        people.add(p3);
        people.add(p1);
        people.add(p4);
        System.out.println(people.offer(p2));

//        System.out.println(people.remove());
//        System.out.println(people.peek());
//        System.out.println(people);
//        for (Person person : people) {
//            System.out.println(person);
//        }
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
