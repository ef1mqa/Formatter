package com.efimov.pack.main;
import com.efimov.pack.formatter.Formatter;
import com.efimov.pack.formatter.MyIOWriterFormatterException;
import com.efimov.pack.formatter.MyReaderFormatterException;
import com.efimov.pack.reader.IReader.IReader;
import com.efimov.pack.reader.MyEncodingReaderException;
import com.efimov.pack.reader.MyReaderFileNotFoundException;
import com.efimov.pack.reader.realisations.FileReader;
import com.efimov.pack.writer.IWriter.IWriter;
import com.efimov.pack.writer.MyEncodingWriterException;
import com.efimov.pack.writer.MyWriterException;
import com.efimov.pack.writer.realisations.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, MyReaderFormatterException, MyIOWriterFormatterException, MyEncodingReaderException, MyEncodingWriterException, MyReaderFileNotFoundException, MyWriterException {
        IReader myRead = new FileReader("inputfile.txt");
        IWriter myWrite = new FileWriter("outputfile.txt");
        Formatter format = new Formatter();
        format.formatter(myRead, myWrite);
    }
}


