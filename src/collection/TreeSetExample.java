package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수는: "+score);

        score = scores.last();
        System.out.println("가장 높은 점수는: "+score);

        score = scores.lower(new Integer(95));
        System.out.println("95보다 아래점수: "+score);

        score = scores.higher(new Integer(95));
        System.out.println("95보다 높은점수: "+score);

        score = scores.floor(new Integer(95));
        System.out.println("95와 같거나 낮은 점수: "+score);

        score = scores.ceiling(new Integer(85));
        System.out.println("85와 같거나 높은 점수: "+score);

        // 내림차순으로 정렬
        NavigableSet<Integer> navigableSet = scores.descendingSet();
        for(Integer s : navigableSet) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        // 내림차순으로 다시 정렬하면 오름차순으로 정렬됨
        NavigableSet<Integer> accendingSet = navigableSet.descendingSet();
        for(Integer s : accendingSet) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        while (!scores.isEmpty()) {
            // 제일 작은 값부터 꺼내고 제거
            score = scores.pollFirst();
            System.out.println("꺼낸 스코어 : "+score+" / 남은 갯수 : "+scores.size());
        }
    }
}
