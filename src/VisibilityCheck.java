import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VisibilityCheck {
    private static  boolean done = false;
    public static void main(String[] args) {

        Runnable t1 = () -> {
            IntStream.range(1,100).forEach(System.out::println);
            done = true;
        };
        Runnable t2 = () -> {
            int i = 0;
          while(!done){
              System.out.println(++i);
          }
        };
        Executor exec = Executors.newCachedThreadPool();
        exec.execute(t1);
        exec.execute(t2);
    }
}
