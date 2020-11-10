package CreativeModel.AbstractFactoryPattern.Factory;

import CreativeModel.AbstractFactoryPattern.Product.Mask.HighEndMask;
import CreativeModel.AbstractFactoryPattern.Product.Mask.IMask;
import CreativeModel.AbstractFactoryPattern.Product.ProtectiveSuit.HighendProtective;
import CreativeModel.AbstractFactoryPattern.Product.ProtectiveSuit.IProtectiveSuit;
//高端工厂
public class HighendFactory implements IFactory {
    @Override
    public IMask CreatMask() {
        IMask mask = new HighEndMask();
        //....
        //初始化
        return mask;
    }

    @Override
    public IProtectiveSuit CreatSuit() {
        IProtectiveSuit suit = new HighendProtective();
        //....
        //初始化
        return suit;
    }
}
