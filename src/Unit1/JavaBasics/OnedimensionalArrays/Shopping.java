package Unit1.JavaBasics.OnedimensionalArrays;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] food = {"Хлеб", "Молоко", "Гречка"};
        int[] prices = {50, 14, 80};
        int[] foodSum = new int[3];

        System.out.println("Список возможных продуктов для покупки:");
        for (int i = 0; i < food.length; i++) {
            System.out.println(i + 1 + ". " + food[i] + ": " + prices[i] + " р./ед.");
        }
        System.out.println("Выберите товар и количество, для завершения покупок введите 'end'.");

        while (true) {
            String userInput = scan.nextLine();

            if (userInput.equals("end")) {
                System.out.println("Ваша корзина: ");
                for (int i = 0; i < foodSum.length; i++) {
                    System.out.println(i + 1 + ". " + food[i] + ": количество " + foodSum[i] + " цена за ед. "
                            + prices[i] + " Общая стоимость: " + foodSum[i] * prices[i]);
                }
                int amount = 0;
                for (int i = 0; i < foodSum.length; i++) {
                    amount = amount + foodSum[i] * prices[i];
                }
                System.out.println("Итого: " + amount + " руб.");
                break;
            }

            String[] parts = userInput.split(" ");
            int userChoiceFood = Integer.parseInt(parts[0]) - 1;
            int userChoiceSum = Integer.parseInt(parts[1]);

            foodSum[userChoiceFood] = foodSum[userChoiceFood] + userChoiceSum;


            System.out.println("выберите еще продукты или завершите покупки, введя 'end'");
        }
    }
}
