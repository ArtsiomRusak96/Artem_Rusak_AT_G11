package homework.day5.stringtask.methods;

public class FindDigits {

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