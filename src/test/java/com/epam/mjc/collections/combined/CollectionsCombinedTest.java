package com.epam.mjc.collections.combined;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CollectionsCombinedTest {

    @Test
    public void testMethodTask1() {
        String[] array = new String[4];
        array[0] = "A";
        array[1] = "B";
        array[2] = "A";
        array[3] = "C";

        Map<String, Integer> actualMap = Task1.countValues(array);

        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("A", 2);
        expectedMap.put("B", 1);
        expectedMap.put("C", 1);
        assertEquals(expectedMap.get("A"), actualMap.get("A"));
        assertEquals(expectedMap.get("B"), actualMap.get("B"));
        assertEquals(expectedMap.get("C"), actualMap.get("C"));
    }

    @Test
    public void testArrayIterator() {
        Integer[] array = new Integer[4];
        array[0] = 10;
        array[1] = 9;
        array[2] = 8;
        array[3] = 7;

        ArrayIterator<Integer> iterator = new ArrayIterator<>(array);
        StringBuilder result = new StringBuilder();
        while (iterator.hasNext()) {
            result.append(iterator.next());
            result.append(" ");
        }

        String expectedResult = "10 9 8 7";
        assertEquals(expectedResult, result.toString().trim());
    }

    @Test
    public void testMethodTask3() {
        Task3 task3 = new Task3();

        Map<Character, Integer> actualMap = task3.buildDictionary("AbAcDDdddEfab dfabbacCd");

        Map<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('a', 5);
        expectedMap.put('b', 4);
        expectedMap.put('c', 3);
        expectedMap.put('d', 7);
        expectedMap.put('e', 1);
        expectedMap.put('f', 2);

        List<Character> keys = new ArrayList<>(actualMap.keySet());
        keys.forEach(k -> assertEquals(expectedMap.get(k), actualMap.get(k)));
    }
}