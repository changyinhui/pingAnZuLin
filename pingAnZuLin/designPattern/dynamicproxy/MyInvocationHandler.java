package pingAnZuLin.designPattern.dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理
public class MyInvocationHandler implements InvocationHandler {
    //代理对象
    private Object target = null;

    //将被代理的obj传递给this.target
    MyInvocationHandler(Object obj){
        this.target = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method方法被代理执行
        return method.invoke(this.target,args);
    }


}
