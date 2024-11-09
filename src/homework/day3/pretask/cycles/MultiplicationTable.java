package pretask;

public class MultiplicationTable {

    public static void main(String[] args) {
        int x = 5;
        for (int i = 1; i < 10; i++) {
            int multiplication = x * i;
            System.out.println(i + " * " + x + " = " + multiplication);
        }
    }
}
