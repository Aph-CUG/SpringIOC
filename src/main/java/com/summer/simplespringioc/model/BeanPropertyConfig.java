package com.summer.simplespringioc.model;

import lombok.Data;

@Data
public class BeanPropertyConfig {
    //属性名
    private String name;
    //属性值
    private String value;
    //属性的值是否引用其他bean
    private Boolean isValueRef;
}
