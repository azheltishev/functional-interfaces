import java.util.function.Predicate;

public class IsEvenPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if (integer == null) {
            throw new IllegalArgumentException("value cannot be null");
        }

        return integer % 2 == 0;
    }
}
