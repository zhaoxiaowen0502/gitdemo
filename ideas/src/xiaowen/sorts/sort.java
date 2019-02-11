package xiaowen.sorts;

public class sort {
    public void sortt(int[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[minIndex] > b[j]) {
                    minIndex = j;
                }
                int t = b[minIndex];
                b[minIndex] = b[i];
                b[i] = t;
            }
        }

    }

    public void sorts(int a[]) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arraySize = 100;
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * arraySize);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

        sort s = new sort();
        //long start = System.currentTimeMillis();
        s.sorts(array);
        //QuickSorts.sort(array, 0, array.length - 1);
        //long end = System.currentTimeMillis();
        //System.out.println("时间"+(end - start) / 1000);

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
