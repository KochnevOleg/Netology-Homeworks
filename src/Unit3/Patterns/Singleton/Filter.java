package Unit3.Patterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int integer : source) {
            if (integer > threshold) {
                logger.log("Element " + integer + " doesn't meets the condition");
            } else {
                logger.log("Element " + integer + " meets the condition");
                result.add(integer);
            }
        }
        return result;
    }

}
