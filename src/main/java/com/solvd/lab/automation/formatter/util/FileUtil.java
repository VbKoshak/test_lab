package com.solvd.lab.automation.formatter.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {

  public static String getStringFromFile(String fileName){
    String result = "";
    try{
      FileReader reader = new FileReader(fileName);
      Scanner scan = new Scanner(reader);
      while(scan.hasNextLine()){
        result += scan.nextLine() + '\n';
      }
    } catch(IOException ex) {
      System.out.println(ex.getMessage());
    }

    return result;
  }

  public static void saveStringInFile(String fileName, String text){
    try {
      FileWriter fw = new FileWriter(fileName);
      fw.write(text);
      fw.close();
    } catch(IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
