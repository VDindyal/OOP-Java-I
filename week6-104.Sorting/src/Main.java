import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        int small = array[0];
        for(int num: array) {
            if(num < small) {
                small = num;
            }
        }
        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        for(int i = index; i < array.length; i++) {
            if(array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array,smallestIndex,i);
            System.out.println(Arrays.toString(array));
        }
    }

}
