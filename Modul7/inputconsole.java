/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Programming_18
 */
public class inputconsole {
      public static String readString(){
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String string=" ";
        try{
            string=bfr.readLine();
        }catch(IOException ex){
            System.out.println(ex);
        }return string;
    }
        public static int readInt(){
        return Integer.parseInt(readString());
    }
         public static double readDouble(){
        return Double.parseDouble(readString());
         }
         
      
}
    
  
  
   
        
        


