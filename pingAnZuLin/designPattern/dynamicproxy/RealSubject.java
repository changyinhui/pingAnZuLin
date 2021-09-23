package pingAnZuLin.designPattern.dynamicProxy1;

/**
 * 被代理类
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("被代理对象"+ str);
    }
}
