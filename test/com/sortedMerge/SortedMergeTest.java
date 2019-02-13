package com.sortedMerge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedMergeTest {

    SortedMerge sortedMerge;

    @Before
    public void init() {
        int[] A = new int[] {5, 10, 15, 20, 25, 0, 0, 0};
        int[] B = new int[] {3, 12, 31};

        sortedMerge = new SortedMerge(A, B);
    }

    @Test
    public void testSortedMerge() {
        int[] C = new int[] {3, 5, 10, 12, 15, 20, 25, 31};
        sortedMerge.mergeBToA();
        assertArrayEquals(C, sortedMerge.A);
    }



}
