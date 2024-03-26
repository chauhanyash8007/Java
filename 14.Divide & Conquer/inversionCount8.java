// Time Complexity = O(n*log n)

public class inversionCount8 {

    public static int merge(int array[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
                k++;
            } else {
                temp[k] = array[j];
                invCount = invCount + (mid - i);
                k++;
                j++;
            }

        }

        while (i < mid) {
            temp[k++] = array[i++];

        }

        while (j <= right) {
            temp[k++] = array[j++];

        }

        for (i = left, k = 0; i <= right; i++, k++) {
            array[i] = temp[k];
        }
        return invCount;
    }

    private static int mergeSort(int array[], int left, int right) {
        int invCount = 0;

        if (right > left) {
            int mid = (right + left) / 2;

            invCount = mergeSort(array, left, mid);
            invCount = invCount + mergeSort(array, mid + 1, right);
            invCount = invCount + merge(array, left, mid + 1, right);
        }
        return invCount;
    }

    public static int getInversion(int array[]) {
        int n = array.length;
        return mergeSort(array, 0, n - 1);

    }

    public static void main(String[] args) {
        int array[] = { 1, 20, 6, 4, 5 };
        System.out.println("inversion count  = " + getInversion(array));

    }
}
