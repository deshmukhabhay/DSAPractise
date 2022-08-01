package Arrays.findMinimumAndMaximumElementInAnArray;

class pair {
    long first;
    long second;

    public pair(long a, long b) {
        this.first = a;
        this.second = b;
    }

}

class Compute {

    static pair getMinMax(long a[], long n) {
        // Write your code here
        long min = a[0];
        long max = a[0];

        for (int i = 1; i < n; i++) {
            long val = (long) a[i];
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        return new pair(min, max);
    }
}