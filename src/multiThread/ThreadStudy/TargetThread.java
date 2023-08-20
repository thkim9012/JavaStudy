package multiThread.ThreadStudy;

public class TargetThread extends Thread {
    @Override
    public void run() {
        for (long i = 0; i < 1_000_000_000; ++i) {}

        try {
            // 1.5초간 일시 정지
            Thread.sleep(1_500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (long i = 0; i < 1_000_000_000; ++i) {

        }

    }
}
