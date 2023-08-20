package MultiThread.ThreadStudy;

public class DataBox {

    private String data;

    public synchronized String getData() {
        if (this.data == null) {
            try {
                System.out.println("DATA가 NULL이면 소비자 스레드를 일시정지상태로 만듦");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String returnValue = data;
        System.out.println("CONSUMER THREAD가 읽은 데이터 : "+returnValue);
        data = null;
        notify();
        System.out.println("생성자 쓰레드를 실행 대기상태로 만듦");
        return returnValue;
    }

    public synchronized void setData(String data) {
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("PRODUCER THREAD가 생성한 데이터 : "+data);
        System.out.println("DATA 필드에 값을 저장하고 소비자 쓰레드를 실행 대기 상태로 만듦");
        notify();
    }
}
