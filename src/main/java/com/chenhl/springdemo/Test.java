package com.chenhl.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/2
 * @描述:
 */
public class Test {

    public static void main(String[] args) {
        // 容器实例化
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
//        System.out.println(applicationContext.getBean(X.class));

        BigDecimal num ;
        //num赋值0.521的35次幂
        num=new BigDecimal(Math.pow(0.521, 35));
        System.out.println(num);//输出num本身
        System.out.println(num.toPlainString());//输出toPlainString后的数值
        System.out.println(num.toString());//输出toString后的数值

    }
}
