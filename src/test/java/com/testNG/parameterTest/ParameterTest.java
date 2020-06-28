package com.testNG.parameterTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void parameterTest(String name, int age) {
        System.out.println("name:"+name+"，age:"+age );
    }
}