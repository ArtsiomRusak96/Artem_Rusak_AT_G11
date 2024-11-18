package classwork.day6;

public class GenericContainer<T> {

    private T[] container;
    private int currentPosition;

    public GenericContainer() {
        container = (T[]) new Object[10];
        currentPosition = 0;
    }

    public void add(T o) {
        if (currentPosition < container.length) {
            container[currentPosition++] = o;
        }
    }

    public T removeLast() {
        T result = null;
        if (currentPosition > 0) {
            result = container[currentPosition - 1];
            container[--currentPosition] = null;
        }
        return result;
    }

    public boolean isEmpty() {
        return currentPosition == 0;
    }
}
