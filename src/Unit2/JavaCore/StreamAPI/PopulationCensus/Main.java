package Unit2.JavaCore.StreamAPI.PopulationCensus;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<Person> listOfPersons = generateTenMillionPeople();

        long countOfMinors = listOfPersons.stream()
                .filter(person -> person.getAge() < 18)
                .count();
        System.out.println("Count of minors is " + countOfMinors);

        List<String> listOfConscripts = listOfPersons.stream()
                .filter(person -> person.getSex().equals(Sex.MAN))
                .filter(person -> person.getAge() >= 18 && person.getAge() < 27)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        List<Person> listOfWorkable = listOfPersons.stream()
                .filter(person -> person.getEducation().equals(Education.HIGHER))
                .filter(person -> {
                    if (person.getSex().equals(Sex.MAN) && person.getAge() >= 18 && person.getAge() < 65) {
                        return true;
                    } else return person.getSex().equals(Sex.WOMAN) && person.getAge() >= 18 && person.getAge() < 60;
                })
                .sorted(Comparator.comparing(Person::getSurname))
                .collect(Collectors.toList());

        System.out.println(listOfWorkable);
    }


    static Collection<Person> generateTenMillionPeople() {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> surnames = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    surnames.get(new Random().nextInt(surnames.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        return persons;
    }
}
