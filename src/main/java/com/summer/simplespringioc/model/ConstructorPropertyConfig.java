package com.summer.simplespringioc.model;

import lombok.Data;

@Data
public class ConstructorPropertyConfig {
    //属性值
    private String value;
    //属性的值是否引用其他的bean
    private Boolean isValueRef;
}
