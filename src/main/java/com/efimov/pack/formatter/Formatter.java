package com.efimov.pack.formatter;
import com.efimov.pack.interfaces.interfaceFormatter;
/**
 * Created by andrey on 07.05.16.
 */
public class Formatter implements interfaceFormatter {
public Formatter(){};
    public void formatter(String unformattedCode) {
        String formattedCode = "";
        char[] chars = unformattedCode.toCharArray();
        unformattedCode = "";
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '{':
                    count++;
                    formattedCode = formattedCode + (String.valueOf(chars[i])) + "\n";
                    formattedCode = formattedCode + "    ";
                    for (int j = 0; j < count - 1; j++)
                        formattedCode = formattedCode + "    ";
                    break;
                case ';':
                    formattedCode = formattedCode + (String.valueOf(chars[i])) + "\n";
                    for (int j = 0; j < count; j++)
                        formattedCode = formattedCode + "    ";
                    break;
                case '}':
                    count--;
                    int nextElem = 0;
                    if (i < chars.length - 1) {
                        nextElem = i + 1;
                    }
                        if (nextElem > 0 & chars[nextElem] != ';') {
                            formattedCode = formattedCode + (String.valueOf(chars[i])) + "\n";
                            for (int j = 0; j < count; j++)
                                formattedCode = formattedCode + "    ";
                        } else formattedCode = formattedCode + (String.valueOf(chars[i]));
                    break;
                default:
                    formattedCode = formattedCode + (String.valueOf(chars[i]));
            }
        }
        unformattedCode = formattedCode;
        System.out.print(unformattedCode);
    }
}

