package pingAnZuLin.designPattern.dynamicProxy1;

public class SubjectDynamicProxy extends DynamicProxy {
//    public static Object newProxyInstance(Subject subject){
    public static <T extends Subject> T newProxyInstance(Subject subject){

        return newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),new MyInvocationHandler(subject));
    }


}
