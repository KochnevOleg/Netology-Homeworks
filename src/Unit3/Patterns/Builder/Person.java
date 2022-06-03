package Unit3.Patterns.Builder;

import java.util.OptionalInt;

public class Person {
    protected String name;
    protected String surname;
    protected OptionalInt age;
    protected String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public boolean hasAge() {
        return this.age.getAsInt() != 0;
    }

    public boolean hasAddress() {
        return this.country != null;
    }

    public void happyBirthday() {
        int presentAge = this.age.getAsInt();
        presentAge++;
        this.age = OptionalInt.of(presentAge);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age.getAsInt() + " years, from " + country;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setCountry(this.country);
    }
}
