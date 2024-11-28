package homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCountTask {

    public static void main(String[] args) {

        String file = "file_with_phrase.txt";
        ReadAndCountTask readAndCountTask = new ReadAndCountTask();
        readAndCountTask.readAndCountCharacters(file);
    }

    public void readAndCountCharacters(String fileName) {
        int countCharacters = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                countCharacters += line.replaceAll(" ", "").length();
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
        System.out.println(countCharacters);
    }
}
