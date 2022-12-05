package AnimalDZ2;

import AnimalDZ2.Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println("Animals "+ Animal.getAnimalCount());
        System.out.println("AnimalDZ2.Dog "+ Dog.getDogCount());
        System.out.println("AnimalDZ2.Cat "+ Cat.getCatCount());


        dog1.ran(300);
        dog2.ran(400);
        dog3.swim(400);
        System.out.println();
        cat1.ran(200);
        cat2.ran(300);
        cat3.swim(300);



    }
}
