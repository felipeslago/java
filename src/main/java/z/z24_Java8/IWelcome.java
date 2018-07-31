package z.z24_Java8;

public interface IWelcome {

    void sayHello();

    // The default keyword makes possible to a class uses this method without implement it
    // Even inserting a new method, it will not affect the classes that not implement it

    default void HelloWorld() {
        System.out.println("Hello World");
    }

}
