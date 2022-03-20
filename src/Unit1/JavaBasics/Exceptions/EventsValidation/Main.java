package Unit1.JavaBasics.Exceptions.EventsValidation;

public class Main {
    public static void main(String[] args) throws RuntimeException{

        for(Event event : getMovies()){
            validEvent(event);
        }

        for(Event event : getConcerts()){
            validEvent(event);
        }

        System.out.println("All events are valid");

    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Schindler's list", 1993, 18),
                new Movie("The Imitation Game", 2014, 16),
                new Movie("The Matrix", 1999, 16),
        };
    }

    public static Concert[] getConcerts(){
        return new Concert[]{
                new Concert("Asking Alexandria", 2008, 18),
                new Concert("Memphis May Fire", 2006, 18),
                new Concert("Periphery", 2005, 18),
                };
    }

    public static void validEvent(Event event) throws RuntimeException{
            if (null == event.title || event.year == 0 || event.permittedAge == 0){
                throw new RuntimeException();
            }
    }
}
