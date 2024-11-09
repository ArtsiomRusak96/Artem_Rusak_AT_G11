package homework.day0;

public class TestClass {

    public static int a = 1;

    public int b = 2;

    public static void main(String[] args) {
        final TestClass a1 = new TestClass();
        final TestClass a2 = new TestClass();
        TestClass.a = 12345;
        a2.b = 67890;
        System.out.println(a1.b);
        System.out.println(TestClass.a);
        System.out.println(a);
        a = 555;
        System.out.println(a);
        System.out.println(a1.b);
        System.out.println(a2.b);
    }


}
