package com.eliteams.quick4j.items.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description of this file.
 * Created by xujw on 2015/9/9.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("items/beans.xml");
        SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator6");
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence3());
    }
}
