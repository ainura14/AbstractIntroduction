package Animal;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow(23.4, 2, 'F', "Kin");
        Cow cow2 = new Cow(21.4, 1, 'M', "Adi");
        Cow cow3 = new Cow(12.4, 4, 'F', "Hon");
        Cow cow4 = new Cow(23.4, 2, 'F', "Kin");
        Cow cow5 = new Cow(2.4, 1, 'M', "Rin");
        Cow cow6 = new Cow(8.4, 5, 'M', "Lin");

        Horse horse1 = new Horse(23.3, 3, 'F', "Kin", "Black");
        Horse horse2 = new Horse(12.3, 6, 'M', "Kin", "Grey");
        Horse horse3 = new Horse(25.3, 3, 'F', "Kin", "White");

        Sheep sheep1 = new Sheep(12.3, 2, 'F', "Kon");
        Sheep sheep2 = new Sheep(12.3, 2, 'F', "Kon");
        Sheep sheep3 = new Sheep(12.3, 2, 'F', "Kon");
        Sheep sheep4 = new Sheep(12.3, 2, 'F', "Kon");

        Horse[] horses = {horse1, horse2};
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Sheep[] sheeps = {sheep1,sheep2, sheep3};

        Farm farm1 = new Farm("Bishkek", cows, horses,sheeps, "Adik");
        System.out.println(farm1.toString());

        Horse[] horses1 = {horse3};
        Cow[] cows1 = {cow6};
        Sheep[] sheeps1 = {sheep4};

        Farm farm2 = new Farm("Naryn", cows1, horses1, sheeps1, "Kadyr");
        System.out.println(farm2.toString());


    }
}
