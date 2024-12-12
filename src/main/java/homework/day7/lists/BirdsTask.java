package homework.day7.lists;

import java.util.Arrays;
import java.util.List;

public class BirdsTask {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int countBird = 0;
        for (String bird : birds) {
            int countVowels = bird.replaceAll("[^аеёиоуыэюяАЕЁИОУЫЭЮЯ]", "").length();
            if (countVowels > 1) {
                countBird++;
            }
        }
        System.out.println(countBird + " birds have more than one vowel in their names");

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        birds.set(2, "Синица");
        System.out.println();

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
