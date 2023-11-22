package Weekend_8.LamdaTest_0705;

@FunctionalInterface
public interface MyFunction<T> {
    public void run();

    public static MyFunction  getMyFunction(String str)
    {
        return () -> System.out.println(str + ".run()");
    }
    public default void sayHello()
    {
        System.out.println("Hello");
    }
}
