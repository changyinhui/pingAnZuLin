package pingAnZuLin.designPattern.dynamicProxy1;

import java.sql.ResultSet;

public class Client {
    public static void main(String[] args) {

        RealSubject subject = new RealSubject();

        //获得代理对象
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //使用代理对象执行方法。
        proxy.doSomething("Finish");

    }
}
