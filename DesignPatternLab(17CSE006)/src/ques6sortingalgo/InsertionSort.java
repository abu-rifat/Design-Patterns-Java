package ques6sortingalgo;

import java.util.Arrays;

public class InsertionSort implements SortingStrategy{
	@Override
	public int[] doOperation(int A[]) {
		Arrays.sort(A);
        return A;
    }
}