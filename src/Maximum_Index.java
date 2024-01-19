public class Maximum_Index {
    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        Maximum_Index m=new Maximum_Index();
        System.out.println(m.maxIndexDiff(arr,arr.length));
    }
    int maxIndexDiff(int[] arr, int n) {
        int[] v_min = new int[n];
        int[] v_max = new int[n];
        v_min[0] = arr[0];
        v_max[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            v_min[i] = Math.min(v_min[i - 1], arr[i]);
            v_max[n - i - 1] = Math.max(v_max[n - i], arr[n - i - 1]);
        }
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (v_min[i] <= v_max[j]) {
                ans = Math.max(ans, j - i);
                j++;
            } else {
                i++;
            }
        }
        return ans;
    }
}
