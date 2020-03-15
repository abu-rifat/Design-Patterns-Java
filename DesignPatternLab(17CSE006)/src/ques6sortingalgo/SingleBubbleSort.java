package ques6sortingalgo;

import java.util.Arrays;

public class SingleBubbleSort {
    private static SingleBubbleSort instance = new SingleBubbleSort();

    private SingleBubbleSort() {
    }

    public static SingleBubbleSort getInstance() {
        return instance;
    }

    public int[] SortNow(int A[]) {
    	Arrays.sort(A);
        return A;
    }
}
