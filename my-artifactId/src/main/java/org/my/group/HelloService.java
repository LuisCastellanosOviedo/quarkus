package org.my.group;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {


    public String sayHello(){
        return "hello from component injected";
    }
}
