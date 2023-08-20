package multiThread.ThreadStudy;

public class WorkThreadB extends Thread {
    private WorkObject workObject;

    public WorkThreadB(WorkObject workObject) {
        // System.out.println("공유 객체를 매개값으로 받아 필드에 저장");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        // System.out.println("공유 객체의 methodB를 실행 시작");
        for (int i = 0; i < 10; ++i) {
            workObject.methodB();
        }
    }
}
