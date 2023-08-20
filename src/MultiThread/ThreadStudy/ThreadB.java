package MultiThread.ThreadStudy;

public class ThreadB extends Thread{


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
                System.out.println("THREAD B 작업 내용");
            } else{
                // 쓰레드 B는 일시정지하고, 쓰레드 A에게 작업을 양보함
                Thread.yield();
            }
        }
        System.out.println("THREAD B 종료");
    }
}
