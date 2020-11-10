package BehavioralModel.ObserverModel;
//宝物
public class Treasure implements Observer {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("宝物，为主角加血！");
        }
    }

    private boolean inRange() {
        return true;
    }
}
