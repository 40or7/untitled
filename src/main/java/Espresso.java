class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
        price = 2.50;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " coffee...");
    }
}