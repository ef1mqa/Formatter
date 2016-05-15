package com.efimov.pack.formatter;
import com.efimov.pack.reader.MyReaderException;

/**
 * Created by andrey on 15.05.16.
 */
public class MyReaderFormatterException extends Throwable {
    public MyReaderFormatterException(String s, MyReaderException e) {
        super(s, e);
    }
}
