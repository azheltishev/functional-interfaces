import java.util.function.Function;

public class FunctionalInterfacesMain {

    public static void main(String[] args) {
        Function<String, Integer> lengthOfString = x -> x.length();

        Function<Integer, Integer> timesTwo = x -> x * 2;


        Integer result = lengthOfString.apply("Hello World");
        System.out.println(result);

        Integer resultTimesTwo = timesTwo.apply(result);
        System.out.println(resultTimesTwo);
    }
}
