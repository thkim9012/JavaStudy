package MultiThread.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
    public static void main(String[] args) {
        // newCachedThreadPool는 요청오면 생성하고 완료되면 종료, newFixedThreadPool는 종료안함.
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("작업처리 요청");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; ++i) {
                    sum += i;
                }
                System.out.println("[처리결과] : " + sum);
            }
        };
        Future future = executorService.submit(runnable);

        try {
            // Runnable은 실행결과가 null이다.
            // 실행결과를 받으려면 Callable을 사용해야한다.
            // future.get메소드는 호출 시, 결과를 받을떄까지 블로킹된다.. -> future받는 새 쓰레드를 사용해야함.
            future.get();
            System.out.println("작업처리 완료");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
