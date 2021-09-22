package pingAnZuLin.designPattern.factory;

/**
 * 抽象工厂类
 */
public abstract class Factory {
    /**
     * 使用抽象产品类的子类，创建产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
