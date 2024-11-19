package Task1;

public class Toyota extends Car{
    public Toyota(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("The Toyota use gas when it want to drive");
    }

    @Override
    public void brake() {
        System.out.println("The Toyota use brake when it want tot brake");
    }

    @Override
    public String toString() {
        gas();
        brake();
        return super.toString();
    }
}
