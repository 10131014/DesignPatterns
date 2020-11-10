package CreativeModel.AbstractFactoryPattern.Factory;

import CreativeModel.AbstractFactoryPattern.Product.Mask.IMask;
import CreativeModel.AbstractFactoryPattern.Product.ProtectiveSuit.IProtectiveSuit;

public interface IFactory {
    //创建口罩
    IMask CreatMask();
    //创建防护服
    IProtectiveSuit CreatSuit();
}
