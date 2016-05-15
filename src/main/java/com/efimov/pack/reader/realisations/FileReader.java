package com.efimov.pack.reader.realisations;
import com.efimov.pack.reader.IReader.IReader;
import com.efimov.pack.reader.MyEncodingReaderException;
import com.efimov.pack.reader.MyReaderException;
import com.efimov.pack.reader.MyReaderFileNotFoundException;
import java.io.*;

/**
 * implements FileReader class to read characters from the file
 */
public class FileReader implements IReader {
    Reader reader;

    /**
     * Constructor class initialising file Stream
     * @param fileName
     * @throws MyEncodingReaderException
     * @throws MyReaderFileNotFoundException
     */
    public FileReader(String fileName) throws MyEncodingReaderException, MyReaderFileNotFoundException {
        try {
            InputStream fileStream = new FileInputStream(new File(fileName));
            Reader fileReader = new InputStreamReader(fileStream, "utf-8");
            this.reader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new MyReaderFileNotFoundException("Unable to open file", e);
        } catch (UnsupportedEncodingException e) {
            throw new MyEncodingReaderException("Incorrect encoding file", e);
        }
    }

    /**
     * Method returning next character
     * @return character
     * @throws MyReaderException
     */
    public char getNext() throws MyReaderException {
        try {
            return (char) this.reader.read();
        } catch (IOException e) {
            throw new MyReaderException("Error next element reading", e);
        }
    }

    /**
     * Method for checking ending stream
     * @return true or false
     * @throws MyReaderException
     */
    public boolean hasNext() throws MyReaderException {
        try {
            return this.reader.ready();
        } catch (IOException e) {
            throw new MyReaderException("Error while checking the next element", e);
        }
    }

    /**
     * Method for closing stream
     * @throws MyReaderException
     */
    public void close() throws MyReaderException {
        try {
            this.reader.close();
        } catch (IOException e) {
            throw new MyReaderException("Error closing", e);
        }
    }
}
