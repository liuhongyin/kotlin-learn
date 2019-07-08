package com.generic;

class GeneralWildcard {
    void showType(GeneralType<?> generalType){
        System.out.println(generalType.getObject().getClass().getName());
    }
}

class GeneralWildcardTest{
    public static void main(String[] args) {
        GeneralWildcard generalWildCard = new GeneralWildcard();
        GeneralType<String> a = new GeneralType<>("test");
        GeneralType<Integer> b = new GeneralType<>(1);
        GeneralType<Double> c = new GeneralType<>(1.0);
        generalWildCard.showType(a);
        generalWildCard.showType(b);
    }
}