package multiThread.ThreadStudy;

public class PrintThread2 extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("실행중~~");
                // 여기서는 쓰레드를 짧게나마 일시정지해야 interrupt 메소드가 통한다. 안그러면 중지할수없음
                // Thread.sleep(1);

                // Thread.interrupted()를 이용하면 interrupt() 호출 시, while문을 빠져나와 일시정지하지 않고 종료할수있다.
                if(Thread.interrupted()) {
                    break;
                }
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }
}
