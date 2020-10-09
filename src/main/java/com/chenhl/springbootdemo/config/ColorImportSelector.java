package com.chenhl.springbootdemo.config;

import com.chenhl.springbootdemo.domain.color.Blue;
import com.chenhl.springbootdemo.domain.color.Green;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
public class ColorImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Blue.class.getName(), Green.class.getName()};
    }

    public ColorImportSelector() {
        System.out.println("ColorImportSelector constractor invoked!");
    }
}
