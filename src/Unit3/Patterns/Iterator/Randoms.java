package Unit3.Patterns.Iterator;

import java.util.Iterator;

public class Randoms implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return (int) ((Math.random() * 10) + 91);
            }
        };
    }
}
