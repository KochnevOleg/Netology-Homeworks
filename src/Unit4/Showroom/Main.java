package Unit4.Showroom;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        String[] threads = {"Покупатель 1",
                "Покупатель 2",
                "Покупатель 3",
                "Покупатель 4",
                "Покупатель 5",
                "Покупатель 5",
                "Покупатель 7",
                "Покупатель 8",
                "Покупатель 9",
                "Покупатель 10",
                "Производитель"};

        for(String thread: threads){
            if(thread.equals("Производитель")) {
                new Thread(showroom::receiveNewCar, thread).start();
            }else{
                new Thread(showroom::sellCar, thread).start();
            }
        }
    }
}
