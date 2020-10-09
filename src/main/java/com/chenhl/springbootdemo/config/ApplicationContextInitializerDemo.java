package com.chenhl.springbootdemo.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/30
 * @描述:
 * ApplicationContextInitializer :用于在刷新容器之前初始化Spring ConfigurableApplicationContext 的回调接口。
 * 通常在需要对应用程序上下文进行某些编程初始化的Web应用程序中使用。例如，根据上下文环境注册属性源或激活配置文件。
 * 请参阅 ContextLoader 和FrameworkServlet 支持，分别声明 "contextInitializerClasses" 的 context-param 和 init-param。 *
 * 鼓励 ApplicationContextInitializer 处理器检测是否已实现Spring的 Ordered 接口，或者是否标注了 @Order 注解，并在调用之前相应地对实例进行排序。
 */
public class ApplicationContextInitializerDemo implements ApplicationContextInitializer {

    public ApplicationContextInitializerDemo() {
        System.out.println("ApplicationContextInitializerDemo#contruct run……");
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializerDemo#initialize run……");
    }
}
