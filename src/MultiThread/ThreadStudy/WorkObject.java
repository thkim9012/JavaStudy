package MultiThread.ThreadStudy;

public class WorkObject {

    public synchronized void methodA() {
        System.out.println("Thread A의 methodA() 작업 실행");
        // System.out.println("notify() ==> 일시정지한 쓰레드를 다시 대기상태로 만듦");
        notify();
        try {
            // System.out.println("wait() ==> THREAD A가 일시 정지합니다.");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        System.out.println("Thread B의 methodB() 작업 실행");
        // System.out.println("notify() ==> 일시정지한 쓰레드를 다시 대기상태로 만듦");
        notify(); // 일시정지 상태에 있는 Thread A를 실행 대기 상태로 만듦
        try {
            //System.out.println("wait() ==> THREAD B가 일시 정지합니다.");
            wait(); // Thread B를 일시 정지상태로 만듬
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
