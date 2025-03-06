public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {24, 53, 76, 89, 32};
        int length = arr.length;

        // Printing the unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        // Bubble Sort Algorithm
        for (int i = 0; i < length - 1; i++) {  // Runs length-1 times
            for (int j = 1; j < length - i; j++) {  // Inner loop
                if (arr[j - 1] > arr[j]) {  // Only swap if needed
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.print("\nSorted array: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
