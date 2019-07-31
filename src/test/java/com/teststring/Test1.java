package com.teststring;

public class Test1 {

    public static void main(String[] args){
        String s1 = new String("nihao");
        String s2 = new String("nihao");
        System.out.println(s1);
        String aa = "nihao";
        System.out.println(aa == s2.intern());
        System.out.println(s1.intern() == s2.intern());
    }

}
