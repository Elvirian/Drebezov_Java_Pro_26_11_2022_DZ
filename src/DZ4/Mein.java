package DZ4;

import DZ4.ObstacleCourse.*;

public class Mein  {
    public static void main(String[] args) {
        Square square1 = new Square(5.0);
        Triangle triangle1 = new Triangle(2,3,4);
        Circle circle1 =new Circle(5);
        System.out.println("Площадь квадрата равна: " +square1.getAria());
        System.out.println("Площадь триугольника равна: " +triangle1.getAria());
        System.out.println("Площадь круга равна: " + circle1.getAria());
        Geometry[] figures = new Geometry[]{
                square1,
                triangle1,
                circle1
        };
        System.out.println("Result: " + Mein.summary(figures));

        System.out.println();
        System.out.println();


        Human human = new Human("Human1 ", 16, 29);
        Cat cat = new Cat("Cat1 ", 5, 50);
        Robot robot = new Robot("Robot1 ", 20, 100);
        Wall wall = new Wall(15);
        RunningTrack track = new RunningTrack(30);
        Obstacle[] obstacles = new Obstacle[]{wall, track};
        Participant[] participants = new Participant[]{human, cat, robot};

        for (Participant participant : participants) {
            System.out.println("New participant " + participant.getName());
            for (Obstacle obstacle : obstacles) {
                System.out.println("New obstacle " + obstacle.getName());
                obstacle.overcome(participant);
                if (participant.getObstacleCounter() == 0) {
                    break;
                }
            }


        }

    }
    public static double summary(Geometry[] figures){
        double result =0.0;
        for (Geometry figure : figures){
            result += figure.getAria();

        }
        return result;

    };

}
