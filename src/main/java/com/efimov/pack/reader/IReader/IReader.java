package com.efimov.pack.reader.IReader;

import com.efimov.pack.reader.MyReaderException;

/**
 * interface for reading characters in stream
 */
public interface IReader {
    /**
     * method for returning next character in stream
     * @return Next char in stream
     * @throws MyReaderException
     */
    public char getNext() throws MyReaderException;

    /**
     * method for checking next element in stream
     * @return true or false
     * @throws MyReaderException
     */
    public boolean hasNext() throws MyReaderException;

    /**
     * method for closing stream
     * @throws MyReaderException
     */
    public void close() throws MyReaderException;
}




