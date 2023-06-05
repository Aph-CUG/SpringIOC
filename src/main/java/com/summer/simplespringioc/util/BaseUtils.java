package com.summer.simplespringioc.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 基础工具类
 */
public class BaseUtils {

    public final static String upperFirstChar(String s) {
        if(StringUtils.isBlank(s)) {
            return s;
        }
        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(s.charAt(0));
        return new String(chars);
    }

    public final static Object convertBaseDataType(String s, String type) {
        if(StringUtils.equals("java.lang.Integer", type)) {
            return Integer.valueOf(s);
        }
        if(StringUtils.equals("java.lang.Long", type)) {
            return Long.valueOf(s);
        }
        if(StringUtils.equals("java.lang.Double", type)) {
            return Double.valueOf(s);
        }
        if(StringUtils.equals("java.lang.Integer", type)) {
            return Integer.valueOf(s);
        }
        return null;
    }
}
