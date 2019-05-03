

public class Main {

    public static void main(String[] args) {

    }


    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];

        for(int i=0; i<array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];
        int len = array.length-1;
        for(int i=0; i<array.length; i++) {
            reversed[i] = array[len];
            len--;
        }
        return reversed;

    }
}
