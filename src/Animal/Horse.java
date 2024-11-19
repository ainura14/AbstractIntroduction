package Animal;

public class Horse extends Animal{
    private String color;

    public Horse(double weight, int age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse: " + "\ncolor:" + color + '\'' + super.toString();
    }
}
