package pingAnZuLin.designPattern.dynamicproxy;

import java.lang.reflect.Proxy;

//代理工厂
public class ProxyFactory {
    //调用此方法，返回一个代理类的对象。解决问题一
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
        //handler就是一个调用处理器，用于根据某个特定的被代理类来创建他的代理类。
        //例如：类似于根据Thread创建Mythread类。
        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }

}
