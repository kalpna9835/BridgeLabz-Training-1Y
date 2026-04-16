import java.util.HashSet;

public class SubsetCheck {

    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5};

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 9};

        System.out.println("arr2 is subset of arr1: " + isSubset(arr1, arr2));
        System.out.println("arr4 is subset of arr3: " + isSubset(arr3, arr4));
    }
}