package multiThread.ThreadStudy;

import java.util.Map;
import java.util.Set;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();

        for (Thread thread : threads) {
            System.out.println("NAME : "+thread.getName() + ((thread.isDaemon()) ? "(데몬)" : "(주)"));
            System.out.println("\t"+"소속그룹: "+thread.getThreadGroup().getName());
            System.out.println();
        }

        System.out.println("메인쓰레드 종료");

    }
}