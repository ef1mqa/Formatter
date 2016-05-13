package com.efimov.pack.formatter;
import com.efimov.pack.interfaces.interfaceFormatter;
/**
 * Created by andrey on 07.05.16.
 */
public class Formatter implements interfaceFormatter {
public Formatter(){};
    public void formatter(String unformattedCode){
        String formattedCode = "";
        char[] chars = unformattedCode.toCharArray();
        unformattedCode = null;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '{' & chars[i] != ';' & chars[i] != '}') formattedCode = formattedCode + (String.valueOf(chars[i]));
            else if (chars[i] == '{') {
                count++;
                formattedCode = formattedCode + (String.valueOf(chars[i])) + "\n";
                for (int j = 0; j < count; j++)
                    formattedCode = formattedCode + "    ";
            }
            else if (chars[i] == ';') {
                formattedCode = formattedCode + (String.valueOf(chars[i])) + "\n";
                for (int j = 0; j < count; j++)
                    formattedCode = formattedCode + "    ";
            }
            else if (chars[i] == '}') {
                count--;
                formattedCode = formattedCode + (String.valueOf(chars[i])) + "\n";
                for (int j = 0; j < count; j++)
                    formattedCode = formattedCode + "    ";
            }
        }
        unformattedCode = formattedCode;
        System.out.print(unformattedCode);
    }
}
