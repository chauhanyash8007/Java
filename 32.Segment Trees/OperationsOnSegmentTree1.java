public class OperationsOnSegmentTree1 {
    static int tree[];

    public static void initialize(int n) {
        tree = new int[4 * n];
    }

    // 1) creation Of SegmentTree
    // Time -> O(n)
    public static int buildST(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start + end) / 2; // for large arrays -> start+(end-start)/2
        buildST(arr, 2 * i + 1, start, mid); // leftSubtree -> 2*i+1
        buildST(arr, 2 * i + 2, mid + 1, end); // rightSubtree -> 2*i+2
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        return tree[i];
    }

    // 2) query's on SegmentTree
    // Time -> O(log n)
    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) { // Non Overlap
            return 0;
        } else if (si >= qi && sj <= qj) { // Complete overlap
            return tree[i];

        } else { // partial overlap
            int mid = (si + sj) / 2;
            int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
            int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return left + right;
        }
    }

    public static int getSum(int arr[], int qi, int qj) {
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);

    }

    // 3) update on SegmentTree
    // Time -> O(log n)
    public static void updateUtil(int i, int si, int sj, int index, int diff) {
        if (index < si || index > sj) { // No overlap case
            return;
        }
        tree[i] += diff; // overlap case and leaf case
        if (si != sj) { // Overlap case non leaf case values
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, index, diff); // left
            updateUtil(2 * i + 2, mid + 1, sj, index, diff); // right
        }

    }

    public static void update(int arr[], int index, int newValue) {
        int n = arr.length;
        int diff = newValue - arr[index];
        arr[index] = newValue;
        updateUtil(0, 0, n - 1, index, diff); // segment tree update

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        initialize(n);
        buildST(arr, 0, 0, n - 1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();

        System.out.println(getSum(arr, 2, 5)); // 18
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5)); // 17

        System.out.println(getSum(arr, 0, 5)); // 20
        System.out.println(getSum(arr, 4, 5)); // 21
        System.out.println(getSum(arr, 3, 7)); // 30

    }
}

/*
 * Segment Trees -> Used To Solve Range Query Questions
 * It is Type of Full Binary tree -> Each has 2 child node expect of leaf node
 * Total Levels in Segment Tree -> log n base 2 Levels
 * Total nodes in Segment Tree -> 2n - 1
 */