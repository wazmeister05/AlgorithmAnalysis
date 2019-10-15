public class AnalysisMain {

    public static void main(String[] args){
        long start = System.nanoTime();     //time before anything done
        algorithm.run();                    //run algorithm
        long end = System.nanoTime();       //time after everything done
        System.out.println("The algorithm ran in " + (end - start) + " nanoseconds.");
    }
}
