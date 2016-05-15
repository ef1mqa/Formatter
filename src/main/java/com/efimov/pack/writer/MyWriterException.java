package com.efimov.pack.writer;

import java.io.FileNotFoundException;

/**
 * Created by andrey on 15.05.16.
 */
public class MyWriterException extends Throwable {
    public MyWriterException(String s, FileNotFoundException e) {
        super(s,e);
    }
}
