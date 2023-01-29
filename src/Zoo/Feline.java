package Zoo;

public abstract class Feline extends Animal {
    private boolean groomed;

    public Feline(String name, boolean bitten, boolean bandage, boolean sick, boolean quarantined, boolean hungry, boolean groomed) {
        super(name, bitten, bandage, sick, quarantined, hungry);
        this.groomed = groomed;
    }

    public boolean isGroomed() {
        return groomed;
    }

    public void setGroomed(boolean groomed) {
        this.groomed = groomed;
    }
}

