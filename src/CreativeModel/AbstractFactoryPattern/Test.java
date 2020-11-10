package CreativeModel.AbstractFactoryPattern;

import CreativeModel.AbstractFactoryPattern.Factory.HighendFactory;
import CreativeModel.AbstractFactoryPattern.Factory.IFactory;
import CreativeModel.AbstractFactoryPattern.Factory.LowendFactory;
import CreativeModel.AbstractFactoryPattern.Product.Mask.IMask;
import CreativeModel.AbstractFactoryPattern.Product.ProtectiveSuit.IProtectiveSuit;

public class Test {
    public static void main(String[] args)
    {
        IFactory factoryA=new LowendFactory();
        IFactory factoryB=new HighendFactory();
        //创建低端口罩
        IMask maskA=factoryA.CreatMask();
        //创建高端口罩
        IMask maskB=factoryB.CreatMask();
        //创建低端防护服
        IProtectiveSuit suitA=factoryA.CreatSuit();
        //创建高端防护服
        IProtectiveSuit suitB=factoryB.CreatSuit();
         maskA.showMask();
         maskB.showMask();
         suitA.showSuit();
         suitB.showSuit();
    }
}
