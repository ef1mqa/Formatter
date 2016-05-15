package com.efimov.pack.writer.IWriter;

import com.efimov.pack.writer.MyIOWriterException;

import java.io.IOException;

/**
 * Interface for writing characters in stream
 */
public interface IWriter {
    /**
     * method for writing character in stream
     * @param str string var
     * @throws MyIOWriterException
     */
    public void write(String str) throws MyIOWriterException;

    /**
     * Method for closing stream
     * @throws MyIOWriterException
     */
    public void close() throws MyIOWriterException;
}
