package Arrays.ReverseArray;

import java.util.*;

class GFG {

    static void printReverseArr(int[] arr) {
        int N = arr.length;
        for (int k = 0; k < N; k++) {
            System.out.print(arr[N - k - 1] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            printReverseArr(arr);
        }
    }
}