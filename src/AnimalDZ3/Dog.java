package AnimalDZ3;

public class Dog extends Animal {
    private final int maxDistance = 300;
    private static int dogCount;
    public Dog() {
        super.maxDistance=this.maxDistance;
        super.isSwim = true;
        incrementDog();
    }

    public static void incrementDog(){
        dogCount++;
    }
    public static int getDogCount(){
        return dogCount;
    }
}
