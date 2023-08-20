package collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 10);
        treeMap.put("forever", 60);
        treeMap.put("description", 40);
        treeMap.put("ever", 10);
        treeMap.put("zoo", 20);
        treeMap.put("base", 20);
        treeMap.put("guess", 70);
        treeMap.put("cherry", 30);

        System.out.println("c~f 사이의 단어 검색 !");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
        for (Map.Entry<String, Integer> map : rangeMap.entrySet()) {
            System.out.println(map.getKey()+"-"+map.getValue());
        }
    }
}
