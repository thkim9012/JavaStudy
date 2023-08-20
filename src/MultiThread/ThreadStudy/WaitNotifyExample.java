package MultiThread.ThreadStudy;

public class WaitNotifyExample {
    public static void main(String[] args) {
        // 공유객체 생성
        WorkObject shareObject = new WorkObject();

        WorkThreadA workThreadA = new WorkThreadA(shareObject);
        WorkThreadB workThreadB = new WorkThreadB(shareObject);

        // 번갈아 가면서 실행
        workThreadA.start();
        workThreadB.start();
    }
}
