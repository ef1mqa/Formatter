package com.efimov.pack.reader;

import java.io.FileNotFoundException;

/**
 * Created by andrey on 15.05.16.
 */
public class MyReaderFileNotFoundException extends Throwable {
    public MyReaderFileNotFoundException(String s, FileNotFoundException e) {
        super(s, e);
    }
}
