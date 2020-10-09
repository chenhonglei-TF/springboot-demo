package com.chenhl.springbootdemo.config;

import com.chenhl.springbootdemo.domain.color.Black;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
public class ColorImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("black", new RootBeanDefinition(Black.class));
    }

    public ColorImportBeanDefinitionRegistrar() {
        System.out.println("ColorImportBeanDefinitionRegistrar constractor invoked!");
    }
}
