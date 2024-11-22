package homework.day5.stringtask;

public class FindDigits {

    public static void main(String[] args) {

        String string = "Hi I am9 611 trying to learn J7ava, HI me too JAVA:4is difficult, b1u2t we are trying 5 to learn0 J123aVa!";

        FindDigits findDigits = new FindDigits();
        findDigits.findDigits(string);
    }

    public void findDigits(String string) {
        String digits = string.replaceAll("[^0-9]", "");
        System.out.println(digits);
        int[] digitArray = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            digitArray[i] = Character.getNumericValue(digits.charAt(i));
            System.out.println(digitArray[i]);
        }
    }
}
