package homework.day5.stringtask.staticmethods;

public class PrintColumnStatic {

    public static void printInColumn(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}
