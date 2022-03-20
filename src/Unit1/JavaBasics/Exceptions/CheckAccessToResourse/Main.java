package Unit1.JavaBasics.Exceptions.CheckAccessToResourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert login");
        String login = scan.nextLine();
        System.out.println("Insert password");
        String password = scan.nextLine();

        validateUser(getUserByLoginAndPassword(login, password));
        System.out.println("Access is allowed.");

    }

    public static User[] getUsers() {
        User user1 = new User("Tom", 25, "Tom Spenser", "Tomqwerty");
        User user2 = new User("John", 29, "John Smith", "Smith123");
        User user3 = new User("Bob", 12, "Bob Kid", "robertkid");

        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        User foundedUser = null;
        for (User user : users) {
            if (login.equals(user.login) && password.equals(user.password)) {
                foundedUser = user;
            }
        }
        if (foundedUser == null) {
            throw new UserNotFoundException("User not found");
        }
        return foundedUser;
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("Access denied by age");
        }
    }
}
