package DZ4.ObstacleCourse;


public class Wall extends Obstacle{


    public Wall(double height) {
        super(height,0,"Woll");
    }

    @Override
    public void overcome(Participant participant){
        if (participant.getMaxJump() > height){
            participant.jump();
            System.out.println(participant.getName() + " перепригнул " + name + " высота: " + height);
        }else {
            participant.resetCounter();
            System.out.println(participant.getName() + " не перепригнул " + name + " высота: " + height + " прыгнул на: " + participant.getMaxJump());

        }

    }



}
