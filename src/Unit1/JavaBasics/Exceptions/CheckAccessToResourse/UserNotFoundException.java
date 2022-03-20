package Unit1.JavaBasics.Exceptions.CheckAccessToResourse;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
