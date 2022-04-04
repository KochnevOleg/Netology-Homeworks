package Unit2.JavaCore.StreamAPI.WorkingWithNums;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = getIntegerList();
        Stream<Integer> filteredAndSorted = getIntegerList().stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder());

        filteredAndSorted.forEach(System.out::println);
    }

    public static List<Integer> getIntegerList() {
        return List.of(
                1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4
        );
    }
}
