package homework.day8;

import java.io.*;

public class ReadReplaceAndWriteTask {

    public static void main(String[] args) {

        String file = "file_with_phrase.txt";
        ReadReplaceAndWriteTask readReplaceAndWriteTask = new ReadReplaceAndWriteTask();
        readReplaceAndWriteTask.readReplaceAndWriteText(file);
    }

    public void readReplaceAndWriteText(String fileName) {
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
        try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
            out.write(textFromFile.replaceAll("[aeiouyAEIOUY]", ""));
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
