package com.efimov.pack.formatter;

import com.efimov.pack.writer.MyIOWriterException;

/**
 * Created by andrey on 15.05.16.
 */
public class MyIOWriterFormatterException extends Exception {
    public MyIOWriterFormatterException(String s, MyIOWriterException e) {
        super(s, e);
    }
}
