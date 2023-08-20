package multiThread.threadPool;

import java.util.concurrent.*;

public class CompletionServiceExample extends Thread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

        System.out.println("작업처리요청");

        for(int i = 0; i < 3; ++i) {
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i = 1; i <= 100000000; ++i) {
                        sum+=i;
                    }
                    return sum;
                }
            });
        }

        System.out.println("완료된 작업 확인");
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println(Thread.currentThread().getName() +"처리결과 : "+value);
                        System.out.println(Thread.currentThread().isInterrupted());
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        });
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("INTERRUPTED");
        executorService.shutdownNow();
    }
}
