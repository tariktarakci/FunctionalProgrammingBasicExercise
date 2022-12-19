package package_2.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static package_2.streams._Stream.Gender.FEMALE;
import static package_2.streams._Stream.Gender.MALE;
import static package_2.streams._Stream.Gender.PREFER_NOT_TO_SAY;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        /*
        Set<Gender> genders = people.stream().map(person -> person.gender).collect(Collectors.toSet());
        System.out.println(genders);

         */

        people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);

        //people.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);

        Predicate<Person> femalePredicate = person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemale = people.stream()
                .allMatch(femalePredicate);



        System.out.println(containsOnlyFemale);


    }


    static class Person{
        private final String name;
        private final Gender gender ;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }


}
