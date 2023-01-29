package Zoo;

public class Keeper extends Human {

    public Keeper(boolean bitten, boolean bandage) {
        super(bitten, bandage);
    }
    public void feed (Animal animal){
        animal.setHungry(false);
        System.out.println(animal.getClass() + " " + animal.getName() + " покормлен!");
    }
    public void groom (Feline feline) {
        if (!feline.isGroomed()) {
            feline.setGroomed(true);
            System.out.println(feline.getClass() + " " + feline.getName() + " вычесан!");
        } else {
            System.out.println(feline.getClass() + " " + feline.getName() + " не нужно вычесывать!");
        }
    }
    public void changeWater (Hippo hippo){
        if (!hippo.isPureWater()) {
        hippo.setPureWater(true);
        System.out.println("У гипопотама " + hippo.getName() + " поменяли воду!");
        } else {
            System.out.println("Гипопотаму " + hippo.getName() + " не нужно менять воду!");
        }
    }
}
