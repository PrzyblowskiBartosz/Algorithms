package pl.brzybylowskiDev;

import java.util.ArrayList;
import java.util.List;

public class Comparison {

    private List<Integer> numbers = new ArrayList<>();
    private static final int NUMBERS_COUNT = 10;
    private static final int NUMBERS_RANGE = 50;

    public Comparison() {
        setNumbers(generateNumbers().getNumbers());
    }

    public void start() {


        System.out.print("RANDOM: ");
        print(numbers);

        System.out.print("SORT: ");
        SortAlgorithm quickSort = new QuickSort();
        SortAlgorithm bubbleSort = new BubbleSort();
        print(quickSort.sort(new ArrayList<>(numbers)));

        System.out.println("\n QUICKSORT:");
        checkTimeAlgorithm(quickSort, numbers);

        System.out.println("\n BUBBLESORT:");
        checkTimeAlgorithm(bubbleSort, numbers);
    }

    private void checkTimeAlgorithm(SortAlgorithm sortAlgorithm, List<Integer> numbers){
        long startTime;
        long time;

        startTime = System.nanoTime();
        print(sortAlgorithm.sort(new ArrayList<>(numbers)));
        time = System.nanoTime() - startTime;

        print("TIME: " + time + " ns");
    }

    private void setNumbers(List<Integer> numbers) {
        this.numbers.addAll(numbers);
    }

    private Numbers generateNumbers() {
        return new Numbers(NUMBERS_COUNT, NUMBERS_RANGE);
    }

    private static void print(Object object) {
        System.out.println(object);
    }
}
