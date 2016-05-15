package com.efimov.pack.reader;

import java.io.IOException;

/**
 * Created by andrey on 15.05.16.
 */
public class MyReaderException extends Exception {
    public MyReaderException(String s, IOException e) {
        super(s, e);
    }
}
