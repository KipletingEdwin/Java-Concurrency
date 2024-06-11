import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private  static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(()->{
            System.out.println("executor example");
        });
    }

    private static void executorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(()->{
            System.out.println("executor service example");
        });
    }
}