package Unit3.Patterns.Builder;

import java.util.OptionalInt;

public class PersonBuilder implements PersonBuilderInterface {

    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = OptionalInt.of(age);
        return this;
    }

    @Override
    public PersonBuilder setCountry(String country) {
        person.country = country;
        return this;
    }

    @Override
    public Person build() {
        if (person.getName() == null || person.getSurname() == null || !person.hasAge() || !person.hasAddress()) {
            throw new IllegalStateException("All fields required.");
        } else if (person.getAge().getAsInt() < 0 || person.getAge().getAsInt() > 120) {
            throw new IllegalArgumentException("Age cannot be less than 0 and more than 120.");
        }
        return person;
    }
}
