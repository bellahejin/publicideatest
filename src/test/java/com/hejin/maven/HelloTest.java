package com.hejin.maven;

import org.junit.Test;

/**
 * @author hejin
 * @create 2024-12-18-16:48
 */
public class HelloTest {

    @Test
    public  void  testHello() {
        SayHello hello = new SayHello();
        String maven = hello.say("maven！！main");
        //String maven = hello.say("maven！！deev");
        System.out.println(maven);
    }
}
