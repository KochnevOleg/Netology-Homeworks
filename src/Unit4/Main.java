package Unit4;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        String[] entities = {"Покупатель 1",
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

        for(String string: entities){
            if(string.equals("Производитель")) {
                new Thread(showroom::receiveNewCar, string).start();
            }else{
                new Thread(showroom::sellCar, string).start();
            }
        }
    }
}
