package pingAnZuLin;

public class Fibonaci {
    public static void main(String[] args) {
        int n = 5;

        int nth = nthInFibonacciRecursion(n);
        int nthLoop = nthInFibonacciLoop(n);
        System.out.println(nth + "\n" + nthLoop);
    }


    //递归调用
    private static int nthInFibonacciRecursion(int n) {
        if (n < 0)
            throw new RuntimeException("invalid input");
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return nthInFibonacciRecursion(n - 1) + nthInFibonacciRecursion(n - 2);
    }

    //使用循环，自底向上；
    //      把已经得到的数据（数列中间项）保存下来（到一个数组中）
    private static int nthInFibonacciLoop(int n) {
        if (n < 0)
            throw new RuntimeException("invalid input");
        int[] result = {0, 1};
        if (n < 2)
            return result[n];

        //保存此三项
        int fibNMinusOne = 0;
        int fibNMinusTwo = 0;
        int fibN = 0;
        for (int i = 2; i < n; i++) {
            fibN = fibNMinusOne + fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }

        return fibN;
    }
}
