package java.SortedMerge;

import java.util.Arrays;

/**
 * Sorted Merge: You are given two sorted arrays, A and B,
 * where A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order.
 */

public class SortedMerge {

    public int[] A, B;

    public SortedMerge(int[] a, int[] b) {
        A = a;
        B = b;
    }

    public void mergeBToA() {
        int indexA = A.length - B.length;
        for (int item: B
             ) {
            A[indexA] = item;
        }
        Arrays.sort(A);
    }

}
