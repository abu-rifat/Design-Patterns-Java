package ques6sortingalgo;

public class Context {
	private SortingStrategy sortingstrategy;

    public Context(SortingStrategy sortingstrategy) {
        this.sortingstrategy = sortingstrategy;
    }

    public int[] executeStrategy(int A[]) {
        return sortingstrategy.doOperation(A);
    }
}
