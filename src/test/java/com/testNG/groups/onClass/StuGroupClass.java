package com.testNG.groups.onClass;

import org.testng.annotations.Test;

@Test(groups ={"stu"})
public class StuGroupClass {
    @Test(groups = {"stu11"})
    public void stu1() {
        System.out.println("stu11111");
    }
    public void stu2() {
        System.out.println("stu22222");
    }
}