package Lesson1_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        int[] x = new int[3];
//
//        for (int i=0;i<4;i++){
//            x[i] = i;
//        }
        List<Integer> list = new ArrayList<>();//list = согласно конвенции имен Java
        for (int i = 0 ; i<10; i++) {
            list.add(i);
        }

//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(99));
//        System.out.println(list.size());
//
//        for (Integer x:list) {
//            System.out.println(x);
//        }
            list.remove(5);
        System.out.println(list);

    }
}
