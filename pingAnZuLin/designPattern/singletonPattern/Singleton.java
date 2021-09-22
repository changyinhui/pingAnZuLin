package pingAnZuLin.designPattern.singletonPattern;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    //对单例对象做一些操作
    public static void doSomething(){}
}
