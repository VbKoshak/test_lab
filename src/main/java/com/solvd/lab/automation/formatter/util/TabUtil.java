package com.solvd.lab.automation.formatter.util;

public class TabUtil {

  private static String makeTab(int tabCount) {
    String tabs = "";
    for (int i = 0; i < tabCount; i++){
      tabs += "\t";
    }
    return tabs;
  }

  public static String normalizeTabs(String input){
    int length = input.length();

    String result = "";
    int tabCount = 0;
    String tabs = "";

    char ch;

    for (int i = 0; i < length; i++) {
      ch = input.charAt(i);
      result += ch;
      if (ch == '{'){
        tabs = makeTab(++tabCount);
      } else if (ch == '\n') {
        result += tabs;
      } else if (ch == '}') {
        tabs = makeTab(--tabCount);
      }
    }

    return result;
  }
}
