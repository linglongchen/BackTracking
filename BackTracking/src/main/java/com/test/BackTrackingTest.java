package com.test;

import com.unit.BackTrackingUnit;

/**
 * 测试
 * @author chenmo
 */
public class BackTrackingTest {
    public static void main(String[] args) {
        BackTrackingUnit backTrackingUnit = new BackTrackingUnit();
//        System.out.println("请输入几个数并用逗号隔开：");
//        Scanner scanner  = new Scanner(System.in);
//        String string = scanner.next();
//        String[] StringArr  = string.split(",");
//        Integer[] arr = (Integer[]) ConvertUtils.convert(StringArr,Integer.class);
        Integer[] arr = new Integer[]{9,3};
        StringBuilder res = backTrackingUnit.getLetterString(arr);
        System.out.println(res);
    }
}
