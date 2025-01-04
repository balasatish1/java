
public class Sort {

    public static void doBubbleSort(int arr[], int arrLength) {

        boolean isSwapped = true;
        for (int i = 0; ((i < arrLength) && isSwapped); i++) {
            isSwapped = false;
            for (int j = 0; j < (arrLength - 1 - i); j++) {

                if (arr[j] > arr[j + 1]) {
                    final int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
        }

    }

    public static void main(String args[]) {

        int arr[] = { 25, 85, -47, 65, 92, 0, -4, 99, -8, 12, 90 };
        doBubbleSort(arr, arr.length);
        for (int eachEle : arr)
            System.out.print("  " + eachEle);
    }
}