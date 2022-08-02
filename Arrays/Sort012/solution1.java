package Arrays.Sort012;

class Solution {
    public static void sort012(int a[], int n) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeros++;
            } else if (a[i] == 1) {
                ones++;
            } else if (a[i] == 2) {
                twos++;
            }
        }
        int count = 0;
        for (int i = 0; i < zeros; i++) {
            a[count] = 0;
            count++;
        }
        for (int i = 0; i < ones; i++) {
            a[count] = 1;
            count++;
        }
        for (int i = 0; i < twos; i++) {
            a[count] = 2;
            count++;
        }
    }
}