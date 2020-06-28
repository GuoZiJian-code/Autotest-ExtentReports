package com.testNG.groups.onClass;

import org.testng.annotations.Test;

@Test(groups = {"Teacher"})
public class TeacherGroupClass {
    public void teacher1() {
        System.out.println("t1111");
    }
    public  void teacher2() {
        System.out.println("t22222");
    }
}