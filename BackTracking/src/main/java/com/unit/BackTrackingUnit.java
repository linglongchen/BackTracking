package com.unit;


import java.util.*;

import static com.unit.WordUnit.getWords;

/**
 * @author chenmo
 */
public class BackTrackingUnit {

    private List<Integer> lists = new ArrayList<Integer>();
    /**
     * 初始化输出字符串
     */
    private StringBuilder result = new StringBuilder();
    /**
     * 初始化第三方字符串，存储相应的值
     */
    private StringBuilder stringBuilder = new StringBuilder();




    /**
     * 输入数组输出相应的值
     * @param arr
     * @return
     */
    public StringBuilder getLetterString(Integer[] arr) {
        if(arr.length == 0) {
            return result;
        }
        List< Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        for (int i = 0; i < list.size(); i++) {
            //判断数组的值是否大于9，若大于9则拆分数值
            if (list.get(i)>9){
                int num = list.get(i);
                list.set(i,num/10);
                list.add(i+1,num%10);
            }
        }
        this.lists = list;
        //执行回溯，从长度为0开始遍历
        reCall(0);
        return result;
    }

    /**
     * 回溯算法
     * @param strLength 字符串当前长度
     */
    private void reCall(int strLength) {
        //判断是否遍历成功，即当前长度是否等于最终长度，若成功则将组成的字母添加到结果集中
        if(strLength == lists.size()) {
            result.append(stringBuilder.toString());
            result.append(" ");
            return;
        }
        char[] arrays = getWords(lists.get(strLength)).toCharArray();
        for(char ch: arrays) {
            stringBuilder.append(ch);
            reCall(strLength + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }



}
