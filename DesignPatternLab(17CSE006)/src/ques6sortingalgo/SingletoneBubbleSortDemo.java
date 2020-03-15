package ques6sortingalgo;

import java.util.Arrays;

public class SingletoneBubbleSortDemo {
	public static void main(String[] args) {
		SingleBubbleSort object = SingleBubbleSort.getInstance();

		int A[]= {5, 4, 2, 9, 2, 1};
        System.out.println(Arrays.toString(object.SortNow(A)));
    }
}
