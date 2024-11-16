package homework.day5.stringtask;

public class PrintColumn {

    public static void main(String[] args) {

        PrintColumn printColumn = new PrintColumn();
        String string = "Print this message in a column!";

        printColumn.printInColumn(string);
    }

    public void printInColumn(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}
