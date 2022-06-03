package Unit2.JavaCore.JVM;


public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // В stack складывается int i = 1

        Object o = new Object();        // Запускается classloader, в metaspace подгружается класс Object

        Integer ii = 2;                 // Запускается classloader, в metaspace подгружается класс Integer
                                        // В heap записывается значение "2", в stack кладется ссылка ii на этот объект

        printAll(o, i, ii);             // В stack создается новый фрейм, в котором кладутся новые ссылки на объекты
                                        // "o" и "ii" и int i = 1

        System.out.println("finished"); // В stack создается новый фрейм, в котором кладется ссылка на объект класса String

                                        // В какой-то момент времени потоки останавливаются, в heap орудует garbage collector
                                        // и чистит heap
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // В heap записывается значение "700", в stack фрейме метода кладется
                                                    // ссылка на объект класса Integer

        System.out.println(o.toString() + i + ii);  // В stack создается фрейм метода println, и создается фрейм метода
                                                    // toString, где кладется новая ссылка на Object o, во фрейме метода
                                                    // println создается новая ссылка на Integer ii и новый int i равный 1
    }
}

