package Lesson43_Refection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner scaner = new Scanner(System.in);
        Class classObject1 = Class.forName(scaner.next());
        Class classObject2 = Class.forName(scaner.next());
        String nethodName = scaner.next();

        Method m1 = classObject1.getMethod(nethodName, classObject2);

        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m1.invoke(o1, o2);

        System.out.println(o1);
    }
}
