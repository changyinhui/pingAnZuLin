package pingAnZuLin.designPattern.dynamicproxy;

public class HumanUtil {
    HumanUtil() throws InterruptedException {
        System.out.println("HumanUtil构造器被执行");
    }

    public void method1() throws InterruptedException {
        System.out.println("====================通用方法一====================");
    }

    public void method2() throws InterruptedException {
        System.out.println("====================通用方法二====================");
    }
}
