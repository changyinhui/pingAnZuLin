package pingAnZuLin;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int[] nums = new int[]{1,6,4,5,3,2,7};
        //冒泡
        int[] a = nums.clone();
        bubble(a);
        for (int i : a)  System.out.print(i+" ");

        //选择
        int[] b = nums.clone();
        select(b);
        for (int i : b)  System.out.print(i+" ");

        //插入
        int[] c = nums.clone();
        insert(c);
        for (int i : c)  System.out.print(i+ " ");

        //快速
        int[] d = nums.clone();
        quick(d,0,d.length - 1);
        for (int i : d)  System.out.print(i+ " ");

        //堆排序
        int[] e = nums.clone();
        heap(e);
        System.out.println(Arrays.toString(e));;


    }

    private static void heap(int[] array) {
        int arrHeapSize = array.length;
        int pos = arrHeapSize / 2 ;
        while(arrHeapSize >0) {
            //自底向上，创建最大堆。
            for (int i = arrHeapSize; i >= 0; i--) {
                maxHeapify(array, i / 2, i);
            }
            int temp = array[arrHeapSize-1];
            array[arrHeapSize-1] = array[0];
            array[0] = temp;

            arrHeapSize--;

        }
    }

    private static void maxHeapify(int[] arr, int pos,int len) {

        int child;
        int temp = arr[pos];

        //重新维护
        int l = pos * 2;          //左子结点
        int r = pos * 2 + 1;      //右子结点
        for (int i = pos;pos > 0;pos--){
            if (l <= len && arr[l-1] > arr[i-1]) {
                temp = arr[i-1];
                arr[i-1] = arr[l-1];
                arr[l-1] = temp;
            }
            if (r <= len && arr[r - 1] > arr[i-1]) {
                temp = arr[i-1];
                arr[i-1] = arr[r-1];
                arr[r-1] = temp;
            }
        }
    }

    private static void quick(int[] d,int left,int right) {

        if (left < right){
            int q = partition(d,left,right);
            quick(d,left,q-1);
            quick(d,q+1,right);
        }

    }

    private static int partition(int[] array, int left, int right) {
        int i, x, temp;
        //x为主元
        x = array[right];
        i = left - 1;

        for (int j = left; j < right; j++) {

            if (array[j] <= x) {
                //array[j]小于等于主元则需要放到i的左侧
                i++;

                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        //把右子列最左侧和主元x交换,此时p-->i均小于i+2-->r的元素
        temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return i + 1;
    }

    private static void insert(int[] c) {
        if (c == null){
            return;
        }
        int length = c.length;
        int temp;
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            if (c[j] > c[i]){
                temp = c[i];
                while (j>=0&&c[j] > temp){
                    c[j + 1] = c[j];
                    --j;
                }
                c[j+1] = temp;
            }
        }
    }

    private static void select(int[] b) {
        if (b == null){
            return;
        }
        int length = b.length;
        int flag = 0;
        int min;
        for (int i = 0; i < length; i++) {
            min = b[i];
            flag = i;
            for (int j = i + 1; j < length; j++) {
                if (b[j] < min){
                    min = b[j];
                    flag = j;
                }
            }
            if (flag != i){
                b[flag] = b[i];
                b[i] = min;
            }
        }

    }

    private static void bubble(int[] a) {
        if (a == null){
            return;
        }
        int length = a.length;
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (a[j-1] > a[j]){
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    private static void swap(int[] array, Integer a, Integer b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    private static void sout(int[] a){

        for (int i : a)  System.out.println(a);

    }
}
