
import java.util.Arrays;
class Main {
    public static boolean array(int[] arr, int index) {
        if (index == arr.length-1) return true;
        if (arr[index] > arr[index+1]) return false;
        return array(arr, index+1);

    }
    public static void main(String[] args) {
        int[] arra = {1, 2, 3, 5, 6 };
        if (array(arra, 0)) {
        System.out.println(Arrays.toString(arra) + "is a sorted array");
        } else {
            System.out.println(Arrays.toString(arra) + "is not a array");
        }
    }
}
