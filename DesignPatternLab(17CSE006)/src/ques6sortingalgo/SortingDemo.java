package ques6sortingalgo;

import java.util.Arrays;

public class SortingDemo {
	public static void main(String[] args) {
		int A[]= {5,4,3,2,1};
        Context context = new Context(new BubbleSort());
        System.out.println(Arrays.toString(context.executeStrategy(A)));

        context = new Context(new QuickSort());
        System.out.println(Arrays.toString(context.executeStrategy(A)));

        context = new Context(new InsertionSort());
        System.out.println(Arrays.toString(context.executeStrategy(A)));
        
        context = new Context(new MargeSort());
        System.out.println(Arrays.toString(context.executeStrategy(A)));
    }
}
