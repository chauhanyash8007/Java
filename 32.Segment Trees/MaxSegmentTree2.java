public class MaxSegmentTree2 {
    static int tree[];

    public static void initialize(int n) {
        tree = new int[4 * n];
    }

    // 1) creation Of SegmentTree
    // Time -> O(n)
    public static void buildSTree(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return;
        }
        int mid = (start + end) / 2; // for large arrays -> start+(end-start)/2
        buildSTree(arr, 2 * i + 1, start, mid); // leftSubtree -> 2*i+1
        buildSTree(arr, 2 * i + 2, mid + 1, end); // rightSubtree -> 2*i+2
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    // 2) query's on SegmentTree
    // Time -> O(log n)
    // To Find Max
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) { // Non Overlap
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) { // Complete overlap
            return tree[i];
        } else { // Partial overlap
            int mid = (si + sj) / 2;
            int left = getMaxUtil(2 * i + 1, si, mid, qi, qj);
            int right = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }

    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    // 3) update on SegmentTree
    // Time -> O(log n)
    public static void updateUtil(int i, int si, int sj, int index, int newValue) {
        if (index < si || index > sj) { // non overlapping
            return;

        }
        if (si == sj) { // leaf case
            tree[i] = newValue;
        }
        if (si != sj) { // non leaf value / overlap case
            tree[i] = Math.max(tree[i], newValue);

            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, index, newValue); // left
            updateUtil(2 * i + 2, mid + 1, sj, index, newValue); // right

        }

    }

    public static void update(int arr[], int index, int newValue) {
        int n = arr.length;
        arr[index] = newValue;
        updateUtil(0, 0, n - 1, index, newValue);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;
        initialize(n);
        buildSTree(arr, 0, 0, n - 1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();

        System.out.println(getMax(arr, 2, 5)); // 17
        update(arr, 2, 20);
        System.out.println(getMax(arr, 2, 5)); // 20

    }
}
