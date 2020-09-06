package LetCo;

public class Timeit {
    public static void code(Runnable task){
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        System.out.println((end-start)/1.0e4);
    }
}
