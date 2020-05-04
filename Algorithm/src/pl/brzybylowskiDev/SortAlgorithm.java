package pl.brzybylowskiDev;

import java.util.List;

public interface SortAlgorithm {

    List<Integer> sort(List<Integer> numbers);

    static void swapNumbersInList(List<Integer> list, int indexA, int indexB) {
        Integer buffer = list.get(indexA);
        list.set(indexA, list.get(indexB));
        list.set(indexB, buffer);
    }

    static boolean isElementsOfListAscending(List<Integer> numbers){
        for (int i = 0; i<numbers.size(); i++)
            if (numbers.get(i) > numbers.get(i+1))
                return false;

            return true;
    }

    static boolean isElementsOfListDescending(List<Integer> numbers){
        for (int i = 0; i<numbers.size(); i++)
            if (numbers.get(i) < numbers.get(i+1))
                return false;

        return true;
    }
}
