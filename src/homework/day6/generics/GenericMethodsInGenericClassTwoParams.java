package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X arg1) {
        int amountArgs = 1;
        return "I received " + amountArgs + " arguments of type: " + arg1.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X arg1, Y arg2) {
        int amountArgs = 2;
        return "I received " + amountArgs + " arguments of type: " + arg1.getClass().getSimpleName() + " class, " + arg2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X arg1, String string) {
        System.out.printf("I got an object of %s class and string with %d characters\n", arg1.getClass().getSimpleName(), string.length());
    }

    public void genericMethodHalfGenArgs(X arg1, Y arg2, String string) {
        System.out.printf("I got an object of %s class and %s class and string with %d characters\n", arg1.getClass().getSimpleName(), arg2.getClass().getSimpleName(), string.length());
    }
}
