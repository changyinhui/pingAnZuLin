package pingAnZuLin.designPattern.factory;

public class MyTest {
    public static void main(String[] args) {
        //创建工厂对象
        ConcreteFactory factory = new ConcreteFactory();
        //的使用工厂对象创建产品
        ConcreteProduct product = factory.createProduct(ConcreteProduct.class);

        System.out.println(product);
    }
}
