package DZ4.ObstacleCourse;

public class RunningTrack extends Obstacle{

    public RunningTrack(double length) {
        super(0,length,"Track");
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getMaxRan() > length){
            participant.run();
            System.out.println(participant.getName() + " смог пробежать "+ name + " на дистанції: " + length);
        }else {
            participant.resetCounter();
            System.out.println(participant.getName() + " не смог пробежать "+ name + " на дистанції: " + length + " Пройдене: " + participant.getMaxRan());

        }

    }

}
