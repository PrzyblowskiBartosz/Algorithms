package pl.brzybylowskiDev;

import java.util.*;

public class Numbers {

    private List<Integer> numbers;

    private int size;
    private int range;

    public Numbers(int size, int range)
    {
        setSize(size);
        setRange(range);

        setNumbersSet();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void printSet(Set<Integer> set)
    {
        System.out.println("Size: " + set.size());
        System.out.println(set);
    }

    private void setNumbersSet() {
        this.numbers = generateRandomNumbersList();
    }

    private List<Integer> generateRandomNumbersList() {
        Random generator = new Random();
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < size) {
            numbers.add(generator.nextInt(range));
        }

        return numbers;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private void setRange(int range) {
        this.range = range;
    }
}
