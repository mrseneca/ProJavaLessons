package Lesson7_LinkedHashMapAndTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); //Внутри не гарантируется никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //В каком порядке были добавлены в таком и вернутся
        Map<Integer, String> treeMap = new TreeMap<>(); // пары (ключ, значение) сортируется по ключу (естественный порядок)

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Dave");
        map.put(7, "Lewis");

        for(Map.Entry<Integer, String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
