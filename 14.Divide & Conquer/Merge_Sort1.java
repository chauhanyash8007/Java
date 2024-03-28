//  Worst Case Time Complexity = O(n log n)
// Space Complexity = O(n)

public class Merge_Sort1 {

    public static void divideMergeSort(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // kam
        int mid = si + (ei - si) / 2; // (si-ei)/2;
        divideMergeSort(array, si, mid); // left part
        divideMergeSort(array, mid + 1, ei); // right part
        mergeSort(array, si, mid, ei);

    }

    public static void mergeSort(int[] array, int si, int mid, int ei) {
        // left (0,3) =4 right (4,6) =3 = 6-0+1
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;

            } else {
                temp[k] = array[j];
                j++;
            }
            k++;

        }

        // left part
        while (i <= mid) {
            temp[k++] = array[i++];

        }

        // right part
        while (j <= ei) {
            temp[k++] = array[j++];

        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];

        }

    }

    public static void main(String[] args) {
        int array[] = { 6, 3, 9, 5, 2, 8, -2 };

        divideMergeSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}