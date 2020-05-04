package pl.brzybylowskiDev;

import java.util.List;

public class BubbleSort implements SortAlgorithm{

    public List<Integer> sort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size()-1; i++)
            if (!isChangedCurrentList(numbers, i))
                break;
        return numbers;
    }

    private static boolean isChangedCurrentList(List<Integer> list, int loopIteration) {
        boolean change = false;
        for (int i = 0; i < list.size() - loopIteration - 1; i++)
            if (isSwapped(list, i))
                change = true;

        return change;
    }

    private static boolean isSwapped(List<Integer> list, int index){
        if (list.get(index) > list.get(index + 1)) {
            SortAlgorithm.swapNumbersInList(list, index, index + 1);
            return true;
        }
        return false;
    }
}
