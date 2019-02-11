package Test;

public class Test1 {
    public static void quicksort(int[] array, int beginIndex, int endIndex) {
        if(beginIndex>=endIndex){
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
            quicksort(array, beginIndex, endIndex - 1);
        } else {
            int t = array[MaxIndex];
            array[MaxIndex] = array[endIndex];
            array[endIndex] = t;

            quicksort(array, beginIndex, MaxIndex - 1);
            quicksort(array, MaxIndex + 1, endIndex);
        }

    }

    public static void main(String[] args) {
        int[] array = {8, 5, 3, 9, 2};
        Test1.quicksort(array, 0, array.length - 1);
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

    }
}
