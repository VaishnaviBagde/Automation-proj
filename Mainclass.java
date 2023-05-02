package com.programjava;

class A
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
 
public class Mainclass
{
    public static void main(String[] args)
    {
        A a = null;
 
        a.staticMethod();
    }
}
