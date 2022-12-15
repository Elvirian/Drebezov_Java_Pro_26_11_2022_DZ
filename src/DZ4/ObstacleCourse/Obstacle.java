package DZ4.ObstacleCourse;

public abstract class Obstacle {
    double height;
    double length;
    String name;

    public Obstacle(
            final double height,
            final double length,
            final String name
    ){
        this.height = height;
        this.length = length;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract void overcome(Participant participant);

}
