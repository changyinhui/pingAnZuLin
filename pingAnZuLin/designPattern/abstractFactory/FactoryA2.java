package pingAnZuLin.designPattern.abstractFactory;

/**
 * 生产A2的工厂
 */
public class FactoryA2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
}
