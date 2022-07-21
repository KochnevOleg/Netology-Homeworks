package Unit4.Showroom;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    private final int SELL_TIME = 3000;
    private final int PRODUCING_TIME = 5000;

    private List<Car> listOfCars;

    public Showroom() {
        listOfCars = new ArrayList<>();
    }


    public synchronized void sellCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " пришел в автосалон за новым автомобилем...\n" +
                    "\"Проверяем наличие автомобиля...\"");
            while (listOfCars.isEmpty()) {
                System.out.println("К сожалению сейчас в наличии нет автомобилей :(\n" + Thread.currentThread().getName() +
                        " ожидает поступления новой партии...");
                wait();
            }
            Thread.sleep(SELL_TIME);
            System.out.println("Автомобиль продан, " + Thread.currentThread().getName() + " счастливый обладатель нового авто!");
            listOfCars.remove(0);
            Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void receiveNewCar() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Поступил новый автомобиль, идет приемка...");
                Thread.sleep(PRODUCING_TIME);
                synchronized (this) {
                    listOfCars.add(new Car());
                    notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
