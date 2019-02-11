package xiaowen.sorts;

public class QuickSorts {

    public static void sort(int[] array, int beginIndex, int endIndex) {
        if (endIndex <= beginIndex) {
            return;
        }
        int MaxIndex = -1;
        for (int i = beginIndex; i < endIndex; i++) {
            if (array[i] > array[endIndex]) {
                if (-1 == MaxIndex) {
                    MaxIndex = i;
                }
            } else {
                if (MaxIndex != -1) {
                    int t = array[MaxIndex];
                    array[MaxIndex] = array[i];
                    array[i] = t;
                    MaxIndex++;
                }
            }
        }
        if (-1 == MaxIndex) {
            sort(array, beginIndex, endIndex - 1);
        } else {
            int t = array[endIndex];
            array[endIndex] = array[MaxIndex];
            array[MaxIndex] = t;

            sort(array, beginIndex, MaxIndex - 1);
            sort(array, MaxIndex + 1, endIndex);

        }
    }

    public static void main(String[] args) {

        int[] array = {7,9,8,10};
        int begin = 0;
        int end = array.length - 1;
        QuickSorts.sort(array, begin, end);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
