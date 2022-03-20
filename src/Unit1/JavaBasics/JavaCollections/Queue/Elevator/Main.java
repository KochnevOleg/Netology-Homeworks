package Unit1.JavaBasics.JavaCollections.Queue.Elevator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> elevatorQueue = new ArrayDeque<>();
        int stopCounter = 0;

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            Integer userChoice = scan.nextInt();

            if (userChoice.equals(elevatorQueue.peekLast())) {
                System.out.println("Лифт находится на этом этаже.");
                continue;
            }

            if (userChoice == 0) {
                elevatorQueue.offer(userChoice);
                break;
            } else if (userChoice > 25 || userChoice < 0) {
                System.out.println("Такого этажа в доме нет.");
                continue;
            }

            elevatorQueue.offer(userChoice);
            stopCounter++;
        }

        int elevatorQueueSize = elevatorQueue.size();
        System.out.println("Лифт проследовал по следующим этажам:");
        while (!elevatorQueue.isEmpty()){
            if (elevatorQueue.size() == 1) {
                System.out.println("этаж " + elevatorQueue.poll() + ".");
                break;
            }
            System.out.print("этаж " + elevatorQueue.poll() + "->");
        }
        System.out.println("Время движения лифта составило: " + (((stopCounter * 5) + (elevatorQueueSize * 10))) + " секунд");
    }
}
