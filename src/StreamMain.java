import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        IsEvenPredicate isEvenPredicate = new IsEvenPredicate();

        var list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(isEvenPredicate)
                .collect(Collectors.toList());

        MathHelper helper = new MathHelper();
        var list2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(helper::isEven)
                .collect(Collectors.toList());

        var list3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list.equals(list2) && list2.equals(list3));
    }
}
