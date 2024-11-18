package homework.day6;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T arg) {
        System.out.printf("I am object of %s class", arg.getClass().getSimpleName());
    }
}
