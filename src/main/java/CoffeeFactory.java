class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("americano")) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("Invalid coffee type");
        }
    }
}