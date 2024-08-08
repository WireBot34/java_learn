package lab;

import java.util.Scanner;

class LinearSearch {

    // Method to get the array from the user
    int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    // Method to get the target element from the user
    int getTarget() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element to search for: ");
        int target = sc.nextInt();

        return target;
    }

    // Method to perform linear search
    int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        // Create an object of the LinearSearch class to access methods
        LinearSearch ls = new LinearSearch();

        // Get the array and target element from the user
        int[] array = ls.getArray();
        int target = ls.getTarget();

        // Perform the linear search
        int result = ls.search(array, target);

        // Display the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
