package homework.day8;

import java.io.*;

public class ReadReplaceAndAddTask {

    public static void main(String[] args) {

        String file = "file_with_phrase.txt";
        ReadReplaceAndAddTask readReplaceAndAddTask = new ReadReplaceAndAddTask();
        readReplaceAndAddTask.readReplaceAndAddText(file);
    }

    public void readReplaceAndAddText(String fileName) {
        String textFromFile = "";
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line = in.readLine();
            while (line != null) {
                textFromFile += line + "\n";
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
        try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true))) {
            out.newLine();
            out.write(textFromFile.replaceAll("[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ]", ""));
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
