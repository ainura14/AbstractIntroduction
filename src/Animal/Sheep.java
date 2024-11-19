package Animal;

public class Sheep extends Animal{
    public Sheep(double weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }
    @Override
    public String toString() {
        return "\nSheep:" + super.toString();
    }
}
