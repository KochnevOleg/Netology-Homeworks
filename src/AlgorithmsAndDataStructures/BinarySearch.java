package AlgorithmsAndDataStructures;

public class BinarySearch {
    public static void main(String[] args) {
        int[] countOfPages = {14, 16, 19, 32, 32, 32, 56, 69, 72};

        System.out.println(howMany(countOfPages, 32));
        System.out.println(howMany(countOfPages, 60));
    }

    public static int howMany(int[] arr, int bookSize) {
        int left = 0;
        int right = arr.length - 1;
        int arrayIndex = 0;

        while (left < right) {
            int middle = (left + right) / 2;
            if (arr[middle] > bookSize) {
                arrayIndex = middle;
                break;
            } else if (arr[middle] <= bookSize) {
                left = middle + 1;
            }
        }

        return arr.length - arrayIndex;
    }
}
