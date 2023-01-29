package Zoo;

public class Squirrel extends Animal{
private boolean escape;

    public Squirrel(String name, boolean sick, boolean quarantined, boolean hungry, boolean bitten, boolean bandage, boolean escape) {
        super(name, sick, quarantined, hungry, bitten, bandage);
        this.escape = escape;
    }

    public boolean isEscape() {
        return escape;
    }

    public void setEscape(boolean escape) {
        this.escape = escape;
    }

    public  void runAway(Squirrel squirrel) {
       if (squirrel.getName().equals("Стрелка")) {
           squirrel.setEscape(true);
       }
    }
}
