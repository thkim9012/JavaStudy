package multiThread.threadStudy;

public class ThreadA extends Thread{


    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {
            if(work) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("THREAD A 작업 내용");
            } else{
                // 쓰레드 A는 일시정지하고, 쓰레드 B에게 작업을 양보함
                Thread.yield();
            }
        }
        System.out.println("THREAD A 종료");
    }
}
