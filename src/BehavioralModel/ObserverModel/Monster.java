package BehavioralModel.ObserverModel;
//怪物
public class Monster implements Observer {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("主角进入攻击范围，怪物开始攻击！");
        }
    }

    private boolean inRange() {
        return true;
    }
}
