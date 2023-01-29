package Zoo;

import java.util.Random;

public class Main {

 public static void main(String[] args) {
  boolean[] toggle = {true, false};
  Random r = new Random();
  
  Vet vet = new Vet(toggle[r.nextInt(2)],toggle[r.nextInt(2)]);
  System.out.println(vet.getClass() + ", " + vet.isBitten()+ ", " + vet.isBandage());
  Keeper keeper = new Keeper(toggle[r.nextInt(2)],toggle[r.nextInt(2)]);
  Squirrel squirrel1= new Squirrel("Стрелка",toggle[r.nextInt(2)],toggle[r.nextInt(2)], toggle[r.nextInt(2)],toggle[r.nextInt(2)],toggle[r.nextInt(2)],toggle[r.nextInt(2)]);
  Squirrel squirrel2= new Squirrel("Ловкач",toggle[r.nextInt(2)],toggle[r.nextInt(2)], toggle[r.nextInt(2)],toggle[r.nextInt(2)],toggle[r.nextInt(2)],toggle[r.nextInt(2)]);
  Hippo hippo = new Hippo("Дуся",toggle[r.nextInt(2)], toggle[r.nextInt(2)],toggle[r.nextInt(2)],toggle[r.nextInt(2)],toggle[r.nextInt(2)],toggle[r.nextInt(2)]);
  Tiger tiger = new Tiger("Жора", toggle[r.nextInt(2)], toggle[r.nextInt(2)], toggle[r.nextInt(2)],toggle[r.nextInt(2)], toggle[r.nextInt(2)],toggle[r.nextInt(2)]);
  Lion lion = new Lion("Кузя", toggle[r.nextInt(2)], toggle[r.nextInt(2)], toggle[r.nextInt(2)],toggle[r.nextInt(2)], toggle[r.nextInt(2)],toggle[r.nextInt(2)]);
  vet.healthCheck(squirrel1);
  vet.healthCheck(squirrel2);
  vet.healthCheck(hippo);
  vet.healthCheck(tiger);
  vet.healthCheck(lion);
  keeper.feed(squirrel1);
  keeper.feed(squirrel2);
  keeper.feed(hippo);
  keeper.feed(lion);
  keeper.feed(tiger);
  keeper.groom(lion);
  keeper.groom(tiger);
  keeper.changeWater(hippo);
  vet.bittenCheck(squirrel1);
  vet.bittenCheck(squirrel1);
  vet.bittenCheck(hippo);
  vet.bittenCheck(lion);
  vet.bittenCheck(tiger);

 }

}
