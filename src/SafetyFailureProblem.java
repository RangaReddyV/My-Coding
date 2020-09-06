import java.util.stream.IntStream;

public class SafetyFailureProblem {
    private static long count = 0;
    public static void main(String[] args) {
       IntStream.range(0,100).forEach(x ->{
               Runnable task = () -> {
                   System.out.println();
       };
       });
        System.out.println(count);
    }
}
