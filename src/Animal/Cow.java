package Animal;

public class Cow extends Animal{
    public Cow(double weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\nCow:" + super.toString();
    }
}
