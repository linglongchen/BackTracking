package com.unit;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenmo
 */
public class WordUnit {

    /**
     * 根据数字对应相应字母
     * @param i
     * @return
     */
    public static String getWords(Integer i) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "");
        map.put(1, "");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        return map.get(i);
    }
}
