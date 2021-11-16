/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
class OpenClock {
  public static void main() {
    Runtime rs = Runtime.getRuntime();

    try {
      rs.exec("C:/Program Files (x86)/FreeAlarmClock/FreeAlarmClock");
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
} 

    

