package com.chenhl.conditions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人: chenhl
 * @创建时间: 2020/8/26
 * @描述:
 */
/*
    @Conditional({XXX.class})：该注解即可以用在类上，也可以作用在方法上
    作用在方法上，表示 满足了XXX.matches方法才会被加入到候选列表里

    refresh() --> org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors
              --> org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors
              --> org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry
              --> org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions
              --> org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitions
              --> org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass
              --> org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForBeanMethod
              --> org.springframework.context.annotation.ConditionEvaluator.shouldSkip(org.springframework.core.type.AnnotatedTypeMetadata, org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase)
                  会执行XXX.matches方法校验，

      作用在类上，表示 满足了XXX.matches方法后才会将该类里的候选放到列表里，否则skip


      类似的注解：
      @ConditionalOnClass(ServletRequest.class): 在classpath下能找到ServletRequest类才会构建这个bean。
      @ConditionalOnBean（仅仅在当前上下文中存在某个对象时，才会实例化一个Bean）
      @ConditionalOnMissingBean（仅仅在当前上下文中不存在某个对象时，才会实例化一个Bean）
      @ConditionalOnClass（当给定的类名在类路径上存在，则实例化当前Bean）
      @ConditionalOnMissingClass（当给定的类名在类路径上不存在，则实例化当前Bean）
      @ConditionalOnExpression（当表达式为true的时候，才会实例化一个Bean）




      @SpringBootCondition
 */
@Configuration
//@Conditional({BillCondition.class})
public class PersonConfig {

    @Bean
    @Conditional({BillCondition.class})
    public Person bill(){
        return new Person("Bill Gates", 62);
    }

    @Bean
    @Conditional({LinuxCondition.class})
    public Person linux(){
        return new Person("Linux", 48);
    }
}
