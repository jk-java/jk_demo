package com.collection;

import basicdatastructure.collection.classes.MyQueue;
import org.junit.Test;

import java.util.Queue;

public class listTest {


    @Test
    public void queueTest(){
        Queue<String> myqueue = new MyQueue<>();

        myqueue.add("你");
        myqueue.add("是");
        myqueue.add("我的");
        myqueue.add("玫瑰");

        String first = myqueue.element();
        System.out.println(first);
        first = myqueue.poll();
        System.out.println(first);
        first = myqueue.poll();
        System.out.println(first);
        first = myqueue.poll();
        System.out.println(first);
        first = myqueue.poll();
        System.out.println(first);
    }
}
