package com.generic;

class GeneralType<Type> {
    private Type object;

    GeneralType(Type object) {
        this.object = object;
    }

    Type getObject() {
        return object;
    }
}

 class GeneralTypeTest {
    public static void main(String[] args) {
        GeneralType<Integer> i = new GeneralType<>(2);
        GeneralType<Double> d = new GeneralType<>(2.0);
        System.out.println(i.getObject());
        System.out.println(i.getClass().getName());
        System.out.println(d.getObject());

    }
}