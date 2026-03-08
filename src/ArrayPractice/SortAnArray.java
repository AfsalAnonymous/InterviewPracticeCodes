package ArrayPractice;
public class SortAnArray {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 4, 6 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
