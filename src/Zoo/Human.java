package Zoo;

public abstract class Human extends ZooMember{

    public Human(boolean bitten, boolean bandage) {
        super(bitten, bandage);
    }

    public void watch (Squirrel squirrel) {
        if (squirrel.getName().equals("Стрелка")) {
            System.out.println("Внимательно смотрю за белкой Стрелка");
        }
    }

}
