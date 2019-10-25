import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public void run(List<Integer> listToSort){
            int n = listToSort.size();

            for (int i = 0; i < n-1; i++){
                for (int j = 0; j < n-i-1; j++){
                    if(listToSort.get(j) > listToSort.get(j+1)){

                        //less efficient method
                        int temp = listToSort.get(j);
                        listToSort.set(j, listToSort.get(j+1));
                        listToSort.set(j+1, temp);

                        //more efficient method
                        //Collections.swap(listToSort, j, j+1);
                    }
                }
            }
        }

}
