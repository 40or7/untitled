public class Main {
    public static void main(String[] args) {
        Coffee espresso = CoffeeFactory.createCoffee("espresso");
        espresso.prepare();
        System.out.println("Price: $" + espresso.getPrice());

        Coffee americano = CoffeeFactory.createCoffee("americano");
        americano.prepare();
        System.out.println("Price: $" + americano.getPrice());
    }
}