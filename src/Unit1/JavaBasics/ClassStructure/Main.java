package Unit1.JavaBasics.ClassStructure;

public class Main {
    public static void main(String[] args) {
        Author js = new Author("John Steinbeck", 1902);
        Book tgow = new Book("'The Grapes of Wrath'", js, 1939, 464);

        tgow.describeShort();
        tgow.describeLong();

        User user1 = new User("John", "Bon Jovi", "jbj@gmail.com");
        User user2 = new User("James", "Hetfield", "jh@gmail.com");
        User user3 = new User("Axel", "Rose", "ar@gmail.com");
        System.out.println("This users online: \n" + user1 + "\n" + user2 + "\n" + user3 + "\n" + User.totalOnline + " Users is online.");
    }
}