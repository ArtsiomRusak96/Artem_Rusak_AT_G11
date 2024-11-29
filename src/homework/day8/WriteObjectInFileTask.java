package homework.day8;

import homework.day5.playground.essence.creatures.Beetle;

import java.io.*;

public class WriteObjectInFileTask {

    public static void main(String[] args) {

        WriteObjectInFileTask writeObjectInFileTask = new WriteObjectInFileTask();
        writeObjectInFileTask.writeObjectInFile();
    }

    public void writeObjectInFile() {
        try (FileOutputStream fos = new FileOutputStream("beetle.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(new Beetle(18, "Potato Beetle"));
        } catch (IOException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
