package homework.day9;

import homework.day7.objects.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleRunner {

    public static void main(String[] args) {

        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        );

        try (BufferedWriter out = new BufferedWriter(new FileWriter("average_age.txt"))) {
            out.write(String.valueOf(people.filter(person -> person.getAge() < 60)
                    .sorted(Comparator.comparing(Person::getName))
                    .map(person -> new Person(person.getAge() + 4, person.getName()))
                    .collect(Collectors.averagingInt(Person::getAge))));
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}
