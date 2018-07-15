package com.yeyouluo.util;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class MyStringUtils {

    /**
     * 重复repeatNum 次 repeatStr
     * @param repeatStr
     * @param repeatNum
     * @return
     */
    public static String repeatableString(String repeatStr, int repeatNum) {
        StringBuilder stringBuilder = new StringBuilder();

        while ( repeatNum-- > 0 ) {
            stringBuilder.append(repeatStr);
        }

        return stringBuilder.toString();
    }
}
