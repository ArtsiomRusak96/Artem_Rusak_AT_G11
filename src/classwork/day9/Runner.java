package classwork.day9;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
//        MyInterface myInterface = () -> 0;
        mc.justMethod(ClassX::new);
    }
}
