package com.monsanto.interview;

import java.util.ArrayList;
import java.util.List;

public class TestingException {

    public static void main(String[] args) {
        
        List<Integer> testExceptionList = null;
        
        try {
            testException(testExceptionList);
        } catch (DivisionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        testExceptionList = new ArrayList<>();
        
        try {
            testException(testExceptionList);
        } catch (DivisionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        testExceptionList.add(2);
        
        try {
            testException(testExceptionList);
        } catch (DivisionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public static void testException(List<Integer> list) throws DivisionException{
        if(null == list){
            throw new DivisionException();
        }
        
        if(list.size() == 0){
            System.out.println("Division Exception");
            throw new DivisionException();
        }
        
    }

}
