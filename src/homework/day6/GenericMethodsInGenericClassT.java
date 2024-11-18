package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    
    public void genericMethodOneGenArg(T arg) {
        System.out.printf("I am object of %s class", arg.getClass().getSimpleName());
    }

    public String genericMethodTwoGenArgs(T arg1, T arg2) {
        return "We are objects of " + arg1.getClass().getSimpleName() + " class and " + arg2.getClass().getSimpleName() + " class";
    }
}
