/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fevercheckprogram;

/**
 *
 * @author jmalinverno
 */
public class FeverCheckProgram {

String   xx = "Hello  Hello Hello";

System.out.println(findout(xx,"ell"));

// given this method

public static int findout(String str, String x)
   {
      String out = "";
      int size = x.length();
      int count = 0;
      int pos = 0;
      while ( (pos = str.indexOf(x , pos)) > 0)
      {
          count += 1;
          pos += size;
      }
          return count;  
       
   } 

}
