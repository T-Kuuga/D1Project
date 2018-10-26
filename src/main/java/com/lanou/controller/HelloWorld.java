package com.lanou.controller;

import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello");
        int[] abc = {1,2};
        String[] abcd = new String[5];
        abcd[0] = 1+"";
        System.out.println(Arrays.toString(abcd));
    }

}
