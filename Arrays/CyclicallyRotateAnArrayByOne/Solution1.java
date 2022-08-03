package Arrays.CyclicallyRotateAnArrayByOne;

class Compute {
    static void reverse(int arr[], int lp, int rp) {
        for (int i = 0; i < (rp - lp + 1) / 2; i++) {
            int temp = arr[rp - i];
            arr[rp - i] = arr[lp + i];
            arr[lp + i] = temp;
        }
    }

    public void rotate(int arr[], int n) {
        int k = 1;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

    }
}