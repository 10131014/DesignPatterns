package BehavioralModel.ObserverModel;
//创建一个客户端
public class client {
    public static void main(String[] args)
    {
        //初始化对象
        Hero hero1=new Hero();
        Monster monster1=new Monster();
        Trap trap1=new Trap();
        Treasure treasure1=new Treasure();
        //添加观察者
        hero1.attachObserver(monster1);
        hero1.attachObserver(trap1);
        hero1.attachObserver(treasure1);
        //主角做出的事件
        hero1.move();
    }
}
