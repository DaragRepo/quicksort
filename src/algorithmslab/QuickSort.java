package algorithmslab;

import java.util.Arrays;

import util.Util;

/**
 *
 * @author mohamed
 */
public class QuickSort {

    private int arr[];

    public QuickSort(int[] arr) {
        this.arr = arr;
        System.out.println(this);
    }

    private int partition(int start, int end) {

        int pivot = arr[start];
        int i = start;
        int j = end;

        while (true) {

            while (i < end && arr[i] <= pivot) {
                i++;
            }

            while (j > start && arr[j] >= pivot) {
                j--;
            }

            if (i < j) {
                Util.swap(arr, i, j);
            } else {
                Util.swap(arr, start, j);
                return j;
            }
        }
    }

    private void quickSort(int start, int end) {
        if (start < end) {
            int pivotInRightPlace = partition(start, end);
            quickSort(start, pivotInRightPlace);
            quickSort(pivotInRightPlace + 1, end);
        }

    }

    @Override
    public String toString() {
        quickSort(0, arr.length - 1);
        return "Array after sorting => " + Arrays.toString(arr);
    }

    public static void main(String[] args) {
        new QuickSort(new int[]{7, 2, 8, 6, 9, 4, 8, 10});

    }
}
