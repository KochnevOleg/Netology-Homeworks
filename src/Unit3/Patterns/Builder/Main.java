package Unit3.Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Person parent = new PersonBuilder()
                .setName("John")
                .setSurname("Smith")
                .setAge(35)
                .setCountry("Canada")
                .build();

        Person child = parent.newChildBuilder()
                .setName("Jack")
                .setAge(10)
                .build();

        System.out.println(parent + " has son " + child);

        try {
            Person person = new PersonBuilder()
                    .setName("Bob")
                    .setAge(48).setCountry("USA")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person anotherPerson = new PersonBuilder()
                    .setName("Rob")
                    .setSurname("Johnson")
                    .setAge(340)
                    .setCountry("Australia")
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
