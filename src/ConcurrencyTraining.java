import java.util.concurrent.*;

public class ConcurrencyTraining implements Runnable {
    @Override
    public void run() {
       for (int i=0; i<100;i++){
           System.out.println("Running "+i);
       }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Training1 training1 = new Training1();
//        training1.start();
        ConcurrencyTraining concurrencyTraining = new ConcurrencyTraining();
//        Thread.sleep(3000);
        Thread t2 = new Thread(concurrencyTraining);
//        t2.start();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(()-> System.out.println("From executor Service"));
        Future future = executor.submit(()-> System.out.println("peeking into the future"));
        Thread.sleep(1500);
        //executor.shutdown();
        Future future2 = executor.submit(new Callable () {
            public String call(){
                return "Result";
            }
        });
        System.out.println(future2.get());
        executor.shutdown();
    }
}

 class Training1 extends Thread{
     @Override
     public void run() {
         for (int i = 0; i < 100; i++) {
             System.out.println(this.getId()+" Running "+i);
         }
     }
 }
