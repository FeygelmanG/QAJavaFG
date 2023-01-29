package Zoo;


public class Vet extends  Human{

    public Vet(boolean bitten, boolean bandage) {
        super(bitten, bandage);
    }

    public void healthCheck(Animal animal) {
        if (animal.isSick()) {
            animal.setQuarantined(true);
            System.out.println(animal.getClass() + " " + animal.getName() + " болен, в карантине!");
        } else {
            animal.setQuarantined(false);
            System.out.println(animal.getClass() + " " + animal.getName() + " здоров, не в карантине!");
        }
    }

    public void bittenCheck(ZooMember zooMember) {
        if (zooMember.isBitten()) {
            zooMember.setBandage(true);
            System.out.println(zooMember.getClass() + " укушен, наложил повязку!");
        } else {
            System.out.println(zooMember.getClass() + " не укушен!");
        }
    }

}
