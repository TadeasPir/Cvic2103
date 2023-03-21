public class Main {
    public static void main(String[] args) {
        Cake cake = new HoneyDecorator(new NuttyDekorator(new SimpleCake()));
        System.out.println(cake.makeCake());

        Cake cake2 = new CaramelDekorator(new ChocolateDekorator(new SimpleCake()));
        System.out.println(cake2.makeCake());
    }
}