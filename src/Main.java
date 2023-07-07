import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Greeter englishGreeter = new Greeter() {
            @Override
            public String sayHello(String name) {
                return "Hello, " + name + "!";
            }
        };

        Greeter russianGreeter = (String name) -> "Здравствуй, " + name + "!";

        Greeter germanGreeter = x -> {
            return "Hallo, " + x + "!";
        };

        String greeting = englishGreeter.sayHello("John");
        System.out.println(greeting);

        // 0. Create interface
        // 1. Class implementation
        // 2. Anonymous class
        // 3. Lambda
        // 4. Shortening lambda

        // Function
        // Supplier
        // Consumer (forEach)
        // Predicate (filter)
    }
}