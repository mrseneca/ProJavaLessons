package Lesson43_Refection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            Class personClass2 = Class.forName("Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class personClass1 = person.getClass();
        Class personClass = Person.class;

        Method[] methods = personClass.getMethods();

//        for (Method method : methods) {
//            System.out.println(method.getName() + "," + method.getReturnType() + "," + Arrays.toString(method.getParameterTypes()));
//        }

//        Field[] fields = personClass.getDeclaredFields();
//
//        for(Field field : fields) {
//            System.out.println(field.getName() + "," + field.getType());
//        }

        Annotation[] annotations = personClass.getAnnotations();

        for(Annotation annotation : annotations) {
           if (annotation instanceof Author) {
               System.out.println("YES!");
           }
        }
    }
}
