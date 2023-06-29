import java.util.Scanner;

public class HA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        System.out.println("Enter the element of the array in ascending order");
        int[] array = new int[n];
        for(int i:array){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Element found at mid index
        } else if (array[mid] > target) {
            return binarySearchRecursive(array, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearchRecursive(array, target, mid + 1, right); // Search in the right half
        }
    }
}