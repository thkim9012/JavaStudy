package multiThread.ThreadPool;

import java.util.concurrent.*;

public class TimeoutExample {

    public static void main(String[] args) {
        ExecutorService executorService = null;

        try {
            executorService = Executors.newFixedThreadPool(1);
            Future future = executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    CallingClass exam = new CallingClass();

                    return exam.returnStringArr();
                }
            });
            String[] result = (String[]) future.get(5, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
            executorService.shutdownNow();
        }
    }

}

class CallingClass {
    public String[] returnStringArr() {
        boolean stop = false;
        while (true) {

            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                if (stop) {
                    break;
                }
            }
            return new String[]{};
        }
    }
}
