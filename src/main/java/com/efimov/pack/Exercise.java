package com.efimov.pack;
import com.efimov.pack.formatter.Formatter;

public class Exercise {
    public static void main(String[] args) {
        String unformattedCode = "package com.efimov.pack.ArrayInvertor;import com.efimov.pack.Invertor.Invertor;import com.efimov.pack.printArray.PrintArray;public class ArrayInvertor {public static void main(final String[] arg) {Integer[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};Double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};String[] arrayString = {\"one\", \"two\", \"three\", \"four\", \"five\", \"six\", \"seven\", \"eight\", \"nine\", \"ten\"};String[] arrayNull = null;PrintArray print = new PrintArray();System.out.print(\"\\nИсходный массив: \");print.printArray(arrayInteger);Invertor invertor = new Invertor();invertor.reverseArray(arrayInteger);System.out.print(\"\\nНаш массив после инвертации: \");print.printArray(arrayInteger);System.out.print(\"\\nИсходный массив: \");print.printArray(arrayDouble);invertor.reverseArray(arrayDouble);System.out.print(\"\\nНаш массив после инвертации: \");print.printArray(arrayDouble);System.out.print(\"\\nИсходный массив: \");print.printArray(arrayString);invertor.reverseArray(arrayString);System.out.print(\"\\nНаш массив после инвертации: \");print.printArray(arrayString);}}}";
        Formatter form = new Formatter();
        form.formatter(unformattedCode);
    }
}
