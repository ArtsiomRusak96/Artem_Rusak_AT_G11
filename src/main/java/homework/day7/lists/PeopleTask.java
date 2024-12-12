package homework.day7.lists;

import homework.day7.objects.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleTask {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }

        System.out.println();

        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }

        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
