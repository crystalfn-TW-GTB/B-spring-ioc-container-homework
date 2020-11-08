package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private final ApplicationContext applicationContext;

    public Foo(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void hi() {
        System.out.println("Hi, " + applicationContext.getBean(Bar.class).name());
    }

    public String name() {
        return "Foo";
    }
}
