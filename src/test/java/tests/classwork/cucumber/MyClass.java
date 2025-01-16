package tests.classwork.cucumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
    private static final Logger LOGGER = LogManager.getLogger(MyClass.class);

    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        LOGGER.info("I am from method 1");
    }

    public static void method2() {
        LOGGER.warn("I am from method 2");
    }
}
