package com.interview.difference;

public interface InterfaceClass {

    public int intVariable = 10;
    public final int intFinalVariable = 20;

    // protected/private not allowed
    public final int intProtectedVariable = 30;

    // cannot have constructors
    /*
     * InterfaceClass(){} // not possible
     * */

    //
    public default void someMethod() {

    }

    // no method body
    public void noMethodBody();

    // no private method body allowed
    // private void privateMethodBody();

}
