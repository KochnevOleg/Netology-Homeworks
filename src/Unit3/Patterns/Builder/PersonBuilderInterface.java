package Unit3.Patterns.Builder;

public interface PersonBuilderInterface {

    PersonBuilder setName(String name);

    PersonBuilder setSurname(String surname);

    PersonBuilder setAge(int age);

    PersonBuilder setCountry(String country);

    Person build();
}
