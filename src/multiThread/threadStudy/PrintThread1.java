package multiThread.threadStudy;

public class PrintThread1 extends Thread {

    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("실행중");
        }
        System.out.println("자원 정리");
        System.out.println("안전한 실행 종료");
    }
}
