package Unit1.JavaBasics.JavaCollections.Queue.RevercePolishNotation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<>();
        Deque<String> operators = new ArrayDeque<>();

        System.out.println("Введите выражение в формате 2 + 2 * 2.");
        String expression = scan.nextLine();
        String[] parts = expression.split(" ");

        for (String part : parts) {
            if (part.matches("\\d+")) {
                numbers.add(Integer.parseInt(part));
            } else {
                operators.add(part);
            }
        }
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }
        while (!operators.isEmpty()) {
            System.out.print(operators.poll() + " ");
        }
    }
}
