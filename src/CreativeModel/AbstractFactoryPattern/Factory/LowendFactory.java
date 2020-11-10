package CreativeModel.AbstractFactoryPattern.Factory;

import CreativeModel.AbstractFactoryPattern.Product.Mask.IMask;
import CreativeModel.AbstractFactoryPattern.Product.Mask.LowEndMask;
import CreativeModel.AbstractFactoryPattern.Product.ProtectiveSuit.IProtectiveSuit;
import CreativeModel.AbstractFactoryPattern.Product.ProtectiveSuit.LowendProtectiveSuit;

//低端工厂
public class LowendFactory implements IFactory {
    @Override
    public IMask CreatMask() {
        IMask mask = new LowEndMask();
        //.....
        //初始化
        return mask;
    }

    @Override
    public IProtectiveSuit CreatSuit() {
        IProtectiveSuit suit = new LowendProtectiveSuit();
        //...
        //初始化
        return suit;
    }
}
