package Arrays.FindUnion;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int doUnion(int a[], int n, int b[], int m) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }
        for (int x : b) {
            set.add(x);
        }
        return set.size();
    }
}
