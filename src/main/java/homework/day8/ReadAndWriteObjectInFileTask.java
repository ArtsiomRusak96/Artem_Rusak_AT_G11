package homework.day8;

import java.io.*;

public class ReadAndWriteObjectInFileTask {

    public static void main(String[] args) {

        ReadAndWriteObjectInFileTask readAndWriteObjectInFileTask = new ReadAndWriteObjectInFileTask();
        readAndWriteObjectInFileTask.readAndWriteObjectInFile();
    }

    public void readAndWriteObjectInFile() {
        try (FileInputStream fis = new FileInputStream("beetle.txt");
             ObjectInputStream ois = new ObjectInputStream(fis);
             BufferedWriter out = new BufferedWriter(new FileWriter("beetle_values.txt"))) {

            out.write(ois.readObject().toString());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
