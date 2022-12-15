package DZ4.ObstacleCourse;

public class  Participant {
    private String name;
    private double maxJump;
    private double maxRan;
    private int obstacleCounter = 0;


    public Participant(
            final String name,
            final double maxJump,
            final double maxRan
    ) {
        this.maxJump = maxJump;
        this.maxRan = maxRan;
        this.name = name;

    }

    public void jump() {
        obstacleCounter++;
        System.out.println("Our participant " + name + "jumped");

    }

    public void run() {
        obstacleCounter++;
        System.out.println("Our participant " + name + "ran");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(double maxJump) {
        this.maxJump = maxJump;
    }

    public double getMaxRan() {
        return maxRan;
    }

    public void setMaxRan(double maxRan) {
        this.maxRan = maxRan;
    }

    public int getObstacleCounter() {
        return this.obstacleCounter;
    }
    public void resetCounter() {
        this.obstacleCounter = 0;
    }
}
