package com.efimov.pack.writer;
import java.io.IOException;

/**
 * Created by andrey on 15.05.16.
 */
public class MyIOWriterException extends Throwable {
    public MyIOWriterException(String s, IOException e) {
        super(s,e);
    }
}