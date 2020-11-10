package BehavioralModel.ObserverModel;
//陷阱
public class Trap implements Observer {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("主角进去陷阱，困住！");
        }
    }

    private boolean inRange() {
        return true;
    }
}
