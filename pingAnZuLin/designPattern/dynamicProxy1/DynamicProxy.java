package pingAnZuLin.designPattern.dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
//    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        if (true){
            //执行一个前置通知
        }
        //执行目标，并返回代理对象
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
