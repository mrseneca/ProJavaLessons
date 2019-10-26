package Lesson11_Comparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("frog");
        animals.add("monkey");
        animals.add("cat");
        animals.add("bird");
        Collections.sort(animals, new StringLengthComparator());

        System.out.println(animals);

        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(0);
        number.add(500);
        number.add(100);
        Collections.sort(number, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                else if (o1 < o2) return 1;
                else return 0;
            }
        });

        System.out.println(number);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Bob"));
        people.add(new Person(1, "Katy"));
        people.add(new Person(2, "Mike"));
        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) return 1;
                else if (o1.getId() < o2.getId()) return -1;
                else return 0;
            }
        });

        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        /*
        o1 > o2 => 1
        o1 == o2 => 0
        o1 < o2 => -1
         */
        if (o1.length()>o2.length()) return 1;
        else if (o1.length()<o2.length()) return -1;
        else return 0;
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

