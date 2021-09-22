package pingAnZuLin.designPattern.abstractFactory;

public class FactoryA1 extends AbstractFactory {
    /**
     * 生产A系列产品A1
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
}
