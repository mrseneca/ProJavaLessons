package Lesson42_Annotations2;

public class Test {
    @MethodInfo(author = "Not Oleg", purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("HelloWorld");
    }
}
