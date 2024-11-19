package Task1;

public class Main {
    public static void main(String[] args) {
        Car lexus1 = new Lexus("RX", "White", 230);
        System.out.println(lexus1);
        Car lexus2 = new Lexus("LS", "Grey", 280);
        System.out.println(lexus2);

        Car toyota1 = new Toyota("Rav-4", "Black", 200);
        System.out.println(toyota1);
        Car toyota2 = new Toyota("Camry", "Gold", 210);
        System.out.println(toyota2);
    }
}
