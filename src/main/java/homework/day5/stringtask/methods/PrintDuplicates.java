package homework.day5.stringtask.methods;

public class PrintDuplicates {

    public void printDuplicatedWords(String string) {
        int amount;
        string = string.toUpperCase();
        String[] allWordsInString = string.split("\\W+");
        for (int i = 0; i < allWordsInString.length; i++) {
            amount = 1;
            for (int j = i + 1; j < allWordsInString.length; j++) {
                if (allWordsInString[i].equals(allWordsInString[j])) {
                    amount++;
                    allWordsInString[j] = "0";
                }
            }
            if (amount > 1 && !allWordsInString[i].equals("0")) {
                System.out.println(allWordsInString[i]);
            }
        }
    }
}
