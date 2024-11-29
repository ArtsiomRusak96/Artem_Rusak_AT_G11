package homework.day5.stringtask.methods;

public class PrintColumn {

    public void printInColumn(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}
