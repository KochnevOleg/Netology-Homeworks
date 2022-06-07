package Unit4;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    Seller seller;
    private List<Car> listOfCars;

    public Showroom() {
        seller = new Seller(this);
        listOfCars = new ArrayList<>();
    }


    public synchronized void sellCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " пришел в автосалон за новым автомобилем...\n" +
                    "\"Проверяем наличие автомобиля...\"");
            while (listOfCars.isEmpty()) {
                System.out.println("К сожалению сейчас в наличии нет автомобилей :(\n" + Thread.currentThread().getName() + " ожидает поступления новой партии...");
                wait();
            }
            Thread.sleep(5000);
            System.out.println("Автомобиль продан, " + Thread.currentThread().getName() + " счастливый обладатель нового авто!");
            listOfCars.remove(0);
            Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void receiveNewCar() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Поступил новый автомобиль, идет приемка...");
                Thread.sleep(1000);
                listOfCars.add(new Car(i));
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
