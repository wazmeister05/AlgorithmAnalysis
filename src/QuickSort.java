import java.util.Collections;
import java.util.List;

public class QuickSort {

    public void run(List<Integer> listToSort){
        quickSort(listToSort, 0, listToSort.size()-1);
    }

    private void quickSort(List<Integer> listToSort, int low, int high){

        if (low < high){
            int pivot = partition(listToSort, low, high);

            quickSort(listToSort, low, pivot-1);
            quickSort(listToSort, pivot+1, high);
        }
    }

    private int partition(List<Integer> listToSort, int low, int high){
        int pivot = listToSort.get(high);

        int i = (low-1);
        for (int j = low; j <= high -1; j++){
            if (listToSort.get(j) <= pivot){
                i++;
                Collections.swap(listToSort, i, j);
            }
        }
        Collections.swap(listToSort, i+1, high);
        return (i+1);
    }

}
