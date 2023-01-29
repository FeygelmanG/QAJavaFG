package Zoo;

public class Hippo extends Animal{
    private boolean pureWater; //Чистая вода

    public Hippo(String name, boolean bitten, boolean bandage, boolean sick, boolean quarantined, boolean hungry, boolean pureWater) {
        super(name, bitten, bandage, sick, quarantined, hungry);
        this.pureWater = pureWater;
    }

    public boolean isPureWater() {
        return pureWater;
    }
    public void setPureWater(boolean pureWater) {
        this.pureWater = pureWater;
    }
}
