public class Main {

    public static void quicksort(int[] arr , int low , int high) {
        if(low < high){
            int pi = partition(arr, low , high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr , int low , int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 2, 10, 1};

        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
