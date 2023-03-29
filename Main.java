public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[] { "Tires", "Keys" };

        Car nissan = new Car("Nissan", 10000, 1995, "Red", spareParts);
        Car dodge = new Car("Dodge", 20000, 2020, "Red", spareParts);

        nissan.setColor("Blue");
        dodge.setColor("Purple");

        Car dodge2 = new Car(dodge);

        dodge2.setColor("Brown");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
        System.out.println("This " + dodge2.getMake() + " is worth $" + dodge2.getPrice() +
                ". It was built in " + dodge2.getYear() + ". It is " + dodge2.getColor() + ".\n");

        dodge2.drive();

        System.out.println(dodge);
    }
}