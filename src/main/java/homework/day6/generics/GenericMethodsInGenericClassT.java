package homework.day6.generics;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T arg) {
        System.out.printf("I am object of %s class\n", arg.getClass().getSimpleName());
    }

    public String genericMethodTwoGenArgs(T arg1, T arg2) {
        return "We are objects of " + arg1.getClass().getSimpleName() + " class and " + arg2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T arg, String string) {
        System.out.printf("I got an object of %s class and string with %d characters\n", arg.getClass().getSimpleName(), string.length());
    }
}
