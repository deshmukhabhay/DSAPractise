package Arrays.SortNegatives;

class Solution {

    public void segregateElements(int arr[], int n) {
        int a[] = new int[n];
        // Your code goes here
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                a[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                a[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }

    }
}
