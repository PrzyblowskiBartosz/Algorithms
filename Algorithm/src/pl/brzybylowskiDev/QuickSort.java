package pl.brzybylowskiDev;

import java.util.List;

public class QuickSort implements SortAlgorithm {

    public List<Integer> sort(List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size()-1);
        return numbers;
    }

    private static void quickSort(List<Integer> list, int startIndex, int endIndex){
        int pivot = list.get(endIndex);
        int left = startIndex;
        int right = endIndex;
        do {
            while(list.get(left) < pivot) left++;
            while(list.get(right) > pivot) right--;
            if(left <= right){
                SortAlgorithm.swapNumbersInList(list, right, left);
                left++; right--;
            }
        } while (left <= right);

        if (right > startIndex) quickSort(list, startIndex, right);
        if (left < endIndex) quickSort(list, left, endIndex);
    }
}
