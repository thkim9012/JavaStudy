package multiThread.ThreadStudy;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            // sumThread가 종료될떄까지 메인쓰레드를 일시 정지시킴
            sumThread.join(); // 얘를 주석하면 메인이 먼저 종료되서 getSum값이 정확하게 안나온다.
        } catch (Exception e) {
            
        }
        System.out.println("1~100까지의 합 : "+sumThread.getSum());

    }
}
