package multiThread.threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
        System.out.println("작업 처리 요청");

        // 결과를 받을 객체 생성
        class Task implements Runnable {
            // 결과를 저장할 객체를 외부 필드에 선언하고 생정자로 받아야함.
            Result result;
            Task(Result result) {
                this.result = result;
            }

            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; ++i) {
                    sum +=i;
                }
                result.addValue(sum);
            }
        }

        Result result = new Result();
        Runnable task1 = new Task(result);
        Runnable task2 = new Task(result);

        Future<Result> future1 = executorService.submit(task1, result);
        Future<Result> future2 = executorService.submit(task2, result);

        try {
            // 두가지 결과를 취합
            result = future1.get();
            result = future2.get();

            System.out.println("[처리결과] "+result.accumValue);
            System.out.println("작업처리 완료");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}

// 처리 결과를 저장할 Result 클래스
class Result {
    int accumValue;
    synchronized void addValue(int value) {
        accumValue+=value;
    }
}