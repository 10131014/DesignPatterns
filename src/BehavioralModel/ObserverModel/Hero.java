package BehavioralModel.ObserverModel;

//建立一个英雄类，也就是主角
public class Hero extends Subject {
    public void move() {
        System.out.println("主角英雄移动了");
        //通知所有观察者
        notifyObserver();
    }
}
