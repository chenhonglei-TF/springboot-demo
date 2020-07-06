package com.chenhl.springbootdemo.annotation;

import com.chenhl.springbootdemo.config.ColorImportBeanDefinitionRegistrar;
import com.chenhl.springbootdemo.config.ColorImportSelector;
import com.chenhl.springbootdemo.config.ColorRegistrarConfiguration;
import com.chenhl.springbootdemo.domain.color.Red;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 *
 * @Import 可以传入四种类型：普通类、配置类、ImportSelector 的实现类，ImportBeanDefinitionRegistrar 的实现类
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Red.class, ColorRegistrarConfiguration.class, ColorImportSelector.class, ColorImportBeanDefinitionRegistrar.class})
public @interface EnableColor {

}
