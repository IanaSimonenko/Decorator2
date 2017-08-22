package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by anasimonenko1 on 22.08.17.
 */
public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }


    @Override
    public void flush() throws IOException {

        amigoOutputStream.flush();

    }

    @Override
    public void write(int b) throws IOException {

        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {

        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {

        amigoOutputStream.write(b, off, len);

    }

    @Override
    public void close() throws IOException {

        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();


        if (line.equals("Д")) {

            amigoOutputStream.close();

        }

    }
}
