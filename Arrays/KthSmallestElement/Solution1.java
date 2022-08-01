package Arrays.KthSmallestElement;

class Solution {
    static void swap(int[] arr, int lp, int rp) {
        int temp = arr[rp];
        arr[rp] = arr[lp];
        arr[lp] = temp;
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        while (l <= r) {
            int p = partition(arr, l, r);
            if (p == k - 1) {
                return arr[p];
            } else if (p > k - 1)
                r = p - 1;
            else
                l = p + 1;
        }
        return -1;
    }
}
