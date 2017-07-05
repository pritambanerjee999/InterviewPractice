package com.simple.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
    
   public static void main(String args[]) throws IOException, Exception{
       
       InputStreamReader r=new InputStreamReader(System.in);    
       BufferedReader br=new BufferedReader(r);  
       
       String thisLine = "";
       
       int count = 0;       
       
       while( !thisLine.equals("stop")){
           thisLine = br.readLine();
           if(count  == 0){
               Integer intVariable = Integer.valueOf(thisLine); 
               count++;
               continue;
           }
           
           if(count > 0 && count < 2){
               String strArr[] = thisLine.split("\\s+");
               
               Integer someInteger = Integer.valueOf(strArr[0]);
               Integer someOtherInteger = Integer.valueOf(strArr[1]);
               count = count + 1;
               System.out.println(someInteger);
               System.out.println(someOtherInteger);
               count = count +1;
               System.out.println("count : " + count);
               continue;
           }
           
           if(count > 2){
               String str = thisLine;
               System.out.println(str);
               count = count +1;
               continue;
           }
           
       }
       
     
       
   }

}
