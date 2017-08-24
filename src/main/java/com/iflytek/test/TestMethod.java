package com.iflytek.test;

public class TestMethod {
    
    public void test(String str){
        if(str.length()>3){
            System.out.println("这个字符串长度大于三:"+str);
        }else{
            System.out.println("这个字符串长度不大于三:"+str);
        }
    }
}
