package multiThread.threadStudy;

public class WorkThreadA extends Thread {
    private WorkObject workObject;

    public WorkThreadA(WorkObject workObject) {
        // System.out.println("공유 객체를 매개값으로 받아 필드에 저장");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        // System.out.println("공유 객체의 method A를 10번 반복 시작");
        for (int i = 0; i < 10; ++i) {
            workObject.methodA();
        }
    }
}
