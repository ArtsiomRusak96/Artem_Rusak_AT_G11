package homework.day8;

import java.util.Scanner;

public class ConsoleOutputTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input smth:");
        String input = scanner.nextLine();

        ConsoleOutputTask consoleOutputTask = new ConsoleOutputTask();
        consoleOutputTask.outputInConsole(input);
    }

    public void outputInConsole(String string) {
        System.out.printf("Hello, I just got '%s' from you!", string);
    }
}
