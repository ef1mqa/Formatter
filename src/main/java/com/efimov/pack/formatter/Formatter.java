package com.efimov.pack.formatter;
import com.efimov.pack.reader.IReader.IReader;
import com.efimov.pack.reader.MyReaderException;
import com.efimov.pack.writer.IWriter.IWriter;
import com.efimov.pack.writer.MyIOWriterException;

/**
 * Formatter to format the source code
 */
public class Formatter{
    /**
     *
     * @param reader stream reading symbol
     * @param writer stream writing symbol
     * @throws MyReaderFormatterException
     * @throws MyIOWriterFormatterException
     */
    public void formatter(IReader reader, IWriter writer) throws MyReaderFormatterException, MyIOWriterFormatterException {
        int count = 0;
        char symb;
        String tab = "    ";
        String enter = "\n";
        try {
            while (reader.hasNext()) {
                switch (symb = reader.getNext()) {
                    case '{':
                        count++;
                        writer.write(Character.toString(symb));
                        writer.write(enter);
                        writer.write(tab);
                        for (int j = 0; j < count - 1; j++)
                            writer.write(tab);
                        break;
                    case ';':
                        writer.write(Character.toString(symb));
                        writer.write(enter);
                        for (int j = 0; j < count; j++)
                            writer.write(tab);
                        break;
                    case '}':
                        count--;
                        writer.write(enter);
                        for (int j = 0; j < count; j++)
                            writer.write(tab);
                        writer.write(Character.toString(symb));
                        break;
                    default:
                        writer.write(Character.toString(symb));
                }
            }
        } catch (MyReaderException e) {
            throw new MyReaderFormatterException("Stream reader can't check next element", e);
        } catch (MyIOWriterException e) {
            throw new MyIOWriterFormatterException("Stream writer can't write", e);
        }

        try {
            reader.close();
        } catch (MyReaderException e) {
            throw new MyReaderFormatterException("Stream reader can't close", e);
        }
        try {
            writer.close();
        } catch (MyIOWriterException e) {
            throw new MyIOWriterFormatterException("Stream writer can't close", e);
        }
    }
}

