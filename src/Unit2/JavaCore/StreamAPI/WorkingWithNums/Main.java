package Unit2.JavaCore.StreamAPI.WorkingWithNums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = getIntegerList();

        List<Integer> positives = new ArrayList<>();
        for(int integer : listOfIntegers) {
            if (integer > 0) {
                positives.add(integer);
            }
        }

        List<Integer> odds = new ArrayList<>();
        for(int integer : positives) {
            if (integer % 2 == 0) {
                 odds.add(integer);
            }
        }

        odds.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        StringBuilder result = new StringBuilder();
        for(int integer : odds) {
            result.append(integer);
            result.append(" ");
        }
        System.out.println(result);
    }

    public static List<Integer> getIntegerList() {
        return List.of(
                1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4
        );
    }
}
