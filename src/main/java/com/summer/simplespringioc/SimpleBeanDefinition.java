package com.summer.simplespringioc;

import com.summer.simplespringioc.model.BeanPropertyConfig;
import com.summer.simplespringioc.model.ConstructorPropertyConfig;
import lombok.Data;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class SimpleBeanDefinition {
    private String id;
    private String className;
    private List<ConstructorPropertyConfig> constructArgs = new ArrayList<>();
    private List<BeanPropertyConfig> properties = new ArrayList<>();
 }
