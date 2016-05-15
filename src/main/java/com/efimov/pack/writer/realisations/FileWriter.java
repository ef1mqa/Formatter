package com.efimov.pack.writer.realisations;

import com.efimov.pack.writer.IWriter.IWriter;
import com.efimov.pack.writer.MyEncodingWriterException;
import com.efimov.pack.writer.MyIOWriterException;
import com.efimov.pack.writer.MyWriterException;

import java.io.*;

/**
 * FileWriter class for writing characters to the file
 */
public class FileWriter implements IWriter {
    Writer writer;

    /**
     * Constructor for initialising output file stream
     * @param fileName name File for stream writing
     * @throws MyEncodingWriterException
     * @throws MyWriterException
     */
    public FileWriter(String fileName) throws MyEncodingWriterException, MyWriterException {
        try {
            OutputStream fileStream = new FileOutputStream(new File(fileName));
            Writer fileWriter = new OutputStreamWriter(fileStream, "utf-8");
            this.writer = new PrintWriter(fileWriter);
        } catch (FileNotFoundException e) {
            throw new MyWriterException("Output file not found", e);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingWriterException("Incorrect encoding", e);
        }
    }

    /**
     * Method for writing character sequence in stream
     * @param charsq char sequence
     * @throws MyIOWriterException
     */
    public void write(String charsq) throws MyIOWriterException {
        try {
            this.writer.append(charsq);
        } catch (IOException e) {
            throw new MyIOWriterException("An error occurred while writing the file", e);
        }
    }

    /**
     * Method for closing writing stream
     * @throws MyIOWriterException
     */
    public void close() throws MyIOWriterException {
        try {
            this.writer.close();
        } catch (IOException e) {
            throw new MyIOWriterException("Closing error", e);
        }
    }
}
