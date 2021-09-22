package pingAnZuLin.designPattern.factory;

/**
 * 具体工厂类
 */
public class ConcreteFactory extends Factory {
    /**
     * 建造产品
     * @param c
     * @param <T>
     * @return
     */
    @Override
    public <T extends Product> T createProduct(Class<T> c) {

        Product product = null;
        try{
            product = (Product) Class.forName(c.getName()).newInstance();

        }catch (Exception e){

        }
        return (T) product;
    }
}
