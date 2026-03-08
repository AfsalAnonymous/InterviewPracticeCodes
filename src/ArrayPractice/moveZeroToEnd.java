package ArrayPractice;
import java.util.Arrays;

public class moveZeroToEnd {

    public int[] moveZero(int[] arr) {
        int len = arr.length;

        if (len == 1) {
            return arr;
        }
        int[] newArray = new int[len];
        int count = 0;
        for (int a : arr) {
            if (a != 0) {
                newArray[count] = a;
                count++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroToEnd move = new moveZeroToEnd();
        int[] newArr = move.moveZero(arr);
        System.err.println(Arrays.toString(newArr));
    }

}
