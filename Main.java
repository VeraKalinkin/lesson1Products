public class Main {
    public static void main(String[] args) {
    Product product = new bottleOfWater("one", 50, 2);
    bottleOfWater product1 = new bottleOfWater("two", 70, 1.5);
    bottleOfWater product2 = new bottleOfWater("three", 100, 1.3);

    HotDrink product3 = new HotDrink("four", 70, 0.5, 90);
    HotDrink product4 = new HotDrink("five", 120, 0.7, 94);
    HotDrink product5 = new HotDrink("four", 100, 0.2, 92);
    HotDrink product6 = new HotDrink("four", 150, 0.5, 93);

    VendingMachine vendingMachine = new vendingMachineBottleOfWater();
        vendingMachine.addProduct(product);
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);

    HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();
        hotDrinksMachine.addProduct(product3);
        hotDrinksMachine.addProduct(product4);
        hotDrinksMachine.addProduct(product5);
        hotDrinksMachine.addProduct(product6);

    System.out.println(hotDrinksMachine.getProduct("five", 0.7, 94));

    }
}