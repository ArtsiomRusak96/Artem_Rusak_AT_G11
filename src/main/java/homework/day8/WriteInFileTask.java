package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFileTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input smth:");
        String input = scanner.nextLine();

        WriteInFileTask writeInFileTask = new WriteInFileTask();
        writeInFileTask.writeInFile(input);
    }

    public void writeInFile(String string) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("file_with_phrase.txt"))) {
            out.write("Hello, I just got '" + string + "' from you!");
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
