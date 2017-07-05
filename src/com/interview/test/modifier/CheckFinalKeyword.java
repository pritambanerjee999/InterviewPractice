package com.interview.test.modifier;

public final class CheckFinalKeyword {

    final int k = 0;
    
    public final void someMethod(){
        System.out.println("Some Method is called");
    }
    
    public final void someMethod(String s1, String s2){
        System.out.println("Some Method is called");
    }
    
    public void testFinalMethod(final int argu){
        //argu cannot be changed
    }
    
}
