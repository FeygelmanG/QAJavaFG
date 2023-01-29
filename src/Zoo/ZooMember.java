package Zoo;

public abstract class ZooMember {
    private boolean bitten; //Укушенный
    private boolean bandage; //Повязка

    public ZooMember(boolean bitten, boolean bandage) {
        this.bitten = bitten;
        this.bandage = bandage;
    }


    public boolean isBitten() {
        return bitten;
    }

    public boolean isBandage() {
        return bandage;
    }

    public void setBandage(boolean bandage) {
        this.bandage = bandage;
    }
}
