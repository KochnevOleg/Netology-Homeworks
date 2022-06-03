package Unit3.Patterns.Singleton;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Starting program");
        System.out.println("Insert list size:");
        int listSize = scanner.nextInt();
        System.out.println("Insert bound");
        int bound = scanner.nextInt();
        logger.log("Creating list");
        logger.log("Generating values");
        List<Integer> createdList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            createdList.add(random.nextInt(bound));
        }
        System.out.println("This is generated list:" + createdList);
        System.out.println("Insert threshold to filtration");
        int threshold = scanner.nextInt();
        Filter filter = new Filter(threshold);
        logger.log("Filtration in process");
        List<Integer> filtratedList = filter.filterOut(createdList);
        System.out.println("Filtrated list: " + filtratedList);
        logger.log("Program finished");
    }
}
