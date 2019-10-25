import java.util.ArrayList;
import java.util.List;

public class AnalysisMain {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(23);
        list.add(142);
        list.add(35);
        list.add(5);
        list.add(41);
        list.add(342);

        long start = System.nanoTime();     //time before anything done
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.run(list);                    //run algorithm
        long end = System.nanoTime();       //time after everything done

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)  + " ");
        }
        System.out.println();
        System.out.println("The Bubblesort algorithm ran in " + (end - start) + " nanoseconds.");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(22);
        list2.add(23);
        list2.add(142);
        list2.add(35);
        list2.add(5);
        list2.add(41);
        list2.add(342);

        long start1 = System.nanoTime();     //time before anything done
        QuickSort quickSort = new QuickSort();
        quickSort.run(list2);            //run algorithm
        long end1 = System.nanoTime();       //time after everything done

        for(int i = 0; i < list2.size(); i++){
            System.out.print(list2.get(i)  + " ");
        }
        System.out.println();
        System.out.println("The QuickSort algorithm ran in " + (end1 - start1) + " nanoseconds.");
    }
}
