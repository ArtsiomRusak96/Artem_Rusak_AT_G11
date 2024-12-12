package homework.day8;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReadCountAndWriteTask {

    public static void main(String[] args) {

        String file = "file_with_phrase.txt";
        ReadCountAndWriteTask readCountAndWriteTask = new ReadCountAndWriteTask();
        readCountAndWriteTask.readCountAndWriteInNewFile(file);
    }

    public void readCountAndWriteInNewFile(String fileName) {
        int countCharacters = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                countCharacters += line.replaceAll(" ", "").length();
            }
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy_H-mm");
        String newFile = currentDateAndTime.format(formatter) + "_" + countCharacters + ".txt";
        try (BufferedWriter out = new BufferedWriter(new FileWriter(newFile))) {
            out.write(String.valueOf(countCharacters));
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
