package com.efimov.pack.writer;
import java.io.UnsupportedEncodingException;

/**
 * Created by andrey on 15.05.16.
 */
public class MyEncodingWriterException extends Throwable {
    public MyEncodingWriterException(String s, UnsupportedEncodingException e) {
        super(s,e);
    }
}