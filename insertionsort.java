public class Main {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 2, 1};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
