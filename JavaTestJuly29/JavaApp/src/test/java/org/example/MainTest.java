package org.example;

import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    Main m = new Main();

    @Test
    public void Test1(){
        String expected = "hello world";
        String actual = m.mainMethod();
        Assert.assertEquals(expected, actual);
    }

}
