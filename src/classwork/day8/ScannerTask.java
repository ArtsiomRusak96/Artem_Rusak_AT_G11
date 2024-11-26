package classwork.day8;

import java.util.Scanner;

public class ScannerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("stop")) {
                return;
            }
            System.out.printf("Just got '%s' text !", incoming);
        }
    }
}