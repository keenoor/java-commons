package com.keenoor.javacommons;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testJDKEncode() {
        System.out.println("default Charset=" + Charset.defaultCharset());
        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("sun.jnu.encoding=" + System.getProperty("sun.jnu.encoding"));
        System.out.println("default Charset OutputStreamWriter=" + new OutputStreamWriter(new ByteArrayOutputStream()).getEncoding());

    }

    @Test
    public void testArray(){

        String[] strings = {"aa", "bb", "cc"};
        String s = Arrays.toString(strings);
        System.out.println(s);
    }

}