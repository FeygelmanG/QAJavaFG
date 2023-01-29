package Zoo;

public abstract class Animal extends ZooMember{
    private String name; //Имя
    private boolean sick; //Больной
    private boolean quarantined; //В карантине
    private boolean hungry; //Голодный

    public Animal(String name, boolean bitten, boolean bandage, boolean sick, boolean quarantined, boolean hungry) {
        super(bitten, bandage);
        this.name = name;
        this.sick = sick;
        this.quarantined = quarantined;
        this.hungry = hungry;
    }
    public String getName() {
        return name;
    }


    public boolean isSick() {
        return sick;
    }

    public void setQuarantined(boolean quarantined) {
        this.quarantined = quarantined;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}

