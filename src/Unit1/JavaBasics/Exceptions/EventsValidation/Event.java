package Unit1.JavaBasics.Exceptions.EventsValidation;

public abstract class Event {
    String title;
    int year;
    int permittedAge;

    public Event(String title,int year, int permittedAge){
        this.title = title;
        this.year = year;
        this.permittedAge = permittedAge;
    }

    public String toString(){
        return title + " " + year + " " + permittedAge;
    }
}
