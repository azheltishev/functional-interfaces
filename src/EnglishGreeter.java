public class EnglishGreeter implements Greeter {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
