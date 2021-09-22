package pingAnZuLin.designPattern.dynamicproxy;

public class SuperMan implements Human {
    @Override
    public String getBelief() {
        return "我是超人";
    }

    @Override
    public void eat(String food) {
        System.out.println("超人吃："+food);
    }
}
