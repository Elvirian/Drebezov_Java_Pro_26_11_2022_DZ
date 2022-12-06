package AnimalDZ3;

public abstract class Animal {

    private static int animalCount;
    protected int maxDistance;
    protected boolean isSwim;

    public Animal() {
        incrementAnimalCount();
    }

    void ran(int distance){
        if (distance>0 && distance<= maxDistance){
            System.out.println(" Run");
        }else{
            System.out.println(" Too much");
        }
    }
    void swim(int distance){
        if (isSwim && (distance>=maxDistance)){
            System.out.println(" wow it's swimming");
        }else{
            System.out.println(" not this time");
        }
    }

    public static int getAnimalCount(){
        return  animalCount;
    }
    public static void incrementAnimalCount(){
        Animal.animalCount++;
    }
}
