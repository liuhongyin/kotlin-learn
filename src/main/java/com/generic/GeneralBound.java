package com.generic;

public class GeneralBound<Type extends Number> {
     private Type object;
     GeneralBound(Type object){
         this.object = object;
     }

    public Type getObject() {
        return object;
    }
}
class GeneralBoundTest{
    GeneralBound <Integer> a = new GeneralBound<>(1);
    GeneralBound <Double> b = new GeneralBound<>(1.2);
//    GeneralBound <String> c = new GeneralBound<>("test");//Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
}