package com.zlq.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {
    public void stu1(){
        System.out.println("GroupOnClass2中的stu1运行··");
    }
    public void stu2(){
        System.out.println("GroupOnClass2中的stu2运行··");
    }
}
