package com.generic;

import java.util.ArrayList;
import java.util.List;

public class GeneralMethod {
    public <Type> void printClassName(Type object) {
        System.out.println(object.getClass().getName());
    }
}

class GeneralMethodTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("test");
        GeneralMethod generalMethod = new GeneralMethod();
        generalMethod.printClassName("test");
        generalMethod.printClassName(1);
        generalMethod.printClassName(1.0);
        generalMethod.printClassName(1.0f);
        generalMethod.printClassName(a);
    }
}