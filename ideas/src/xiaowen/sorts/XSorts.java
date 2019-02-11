package xiaowen.sorts;

import java.util.ArrayList;

import java.util.List;

public class XSorts {
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = 110 - i;
//          System.out.println(array[i]);
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        XSorts s = new XSorts();
        s.sort(array);
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
