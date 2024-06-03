class Americano extends Coffee {
    public Americano() {
        name = "Americano";
        price = 3.00;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " coffee...");
    }
}