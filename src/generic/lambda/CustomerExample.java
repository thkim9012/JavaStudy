package generic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class CustomerExample {

    public static List<String> list = Arrays.asList(new String[]{"static", " ", "list", "~"});

    public static void printString(Function<String, String> function) {

        for (String ss : list) {
            System.out.print(function.apply(ss));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Consumer<String> consumer = t -> {
            System.out.println(t);
        };
        consumer.accept("Java");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("z", "z");

        DoubleConsumer doubleConsumer = (x) -> System.out.println(x);
        doubleConsumer.accept(1.0);

        ObjIntConsumer<String> objIntConsumer = (x, i) -> System.out.println(x+ i);
        objIntConsumer.accept("zzz", 1);




        printString(t -> t);

        IntBinaryOperator a = Math :: max;
        int res = a.applyAsInt(3,2);
        System.out.println(res);

    }
}
