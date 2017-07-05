package com.core.java;

public class A {

    public String a = "I am A";

    private String strA;

    public String getStrA() {
        return strA;
    }

    public void setStrA(String strA) {
        this.strA = strA;
    }

    public A(){
        
    }
    
    public A(A a) {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
