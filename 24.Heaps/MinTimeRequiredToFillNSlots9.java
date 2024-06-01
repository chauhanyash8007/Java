
//Time Complexity : o(n)
//Space Complexity: o(n)

import java.util.*;

public class MinTimeRequiredToFillNSlots9 {
    public static void minTime(int arr[],
            int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[N + 1];
        int time = 0;
        for (int i = 0; i < K; i++) {
            q.add(arr[i]);
            vis[arr[i]] = true;
        }
        while (q.size() > 0) {
            for (int i = 0; i < q.size(); i++) {
                int current = q.poll();
                if (current - 1 >= 1 &&
                        !vis[current - 1]) {
                    vis[current - 1] = true;
                    q.add(current - 1);
                }
                if (current + 1 <= N &&
                        !vis[current + 1]) {
                    vis[current + 1] = true;
                    q.add(current + 1);
                }
            }
            time++;
        }
        System.out.println(time - 1);
    }

    public static void main(String[] args) {
        int N = 6;
        int arr[] = { 2, 6 };
        int K = arr.length;
        minTime(arr, N, K);

    }
}
